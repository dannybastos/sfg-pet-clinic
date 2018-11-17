package br.com.spring5.petclinic.service;

import br.com.spring5.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by danny on 16/11/18.
 */
public interface OwnerService extends CrudRepository<Owner, Long> {
}
