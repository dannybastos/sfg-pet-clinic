package br.com.spring5.petclinic.service;

import org.springframework.data.repository.CrudRepository;

import br.com.spring5.petclinic.model.Vet;

public interface VetsService extends CrudRepository<Vet, Long> {
}
