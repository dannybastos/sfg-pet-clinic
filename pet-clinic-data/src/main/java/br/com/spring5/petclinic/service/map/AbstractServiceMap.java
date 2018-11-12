package br.com.spring5.petclinic.service.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public abstract class AbstractServiceMap<T, ID> implements CrudRepository<T, ID> {
	private Map<Long, T> map;
	public AbstractServiceMap() {
		map = new HashMap<>();
	}
	
	public Optional<T> findById(ID id) {
		Optional<T> result = Optional.of(map.get(id));
		return result;
	}
	
	@Override
	public <S extends T> S save(S entity) {
		Long id = map.size() + 1l;
		map.put(id, entity);
		return entity;
	}
	
	@Override
	public <S extends T> Iterable<S> saveAll(Iterable<S> entities) {
		entities.forEach( item -> {
			Long id = map.size() + 1l;
			map.put(id, item);
		});
		return entities;
	}

	@Override
	public boolean existsById(ID id) {
		return map.containsKey(id);
	}

	@Override
	public Collection<T> findAll() {
		return map.values();
	}

	@Override
	public Iterable<T> findAllById(Iterable<ID> ids) {
		return null;
	}

	@Override
	public long count() {
		return map.size();
	}

	@Override
	public void deleteById(ID id) {
		map.remove(id);
	}
	
	@Override
	public void delete(T entity) {
	}

	@Override
	public void deleteAll(Iterable<? extends T> entities) {
	}

	@Override
	public void deleteAll() {
	}
	
}
