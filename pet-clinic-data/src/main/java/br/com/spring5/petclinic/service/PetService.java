package br.com.spring5.petclinic.service;

import org.springframework.data.repository.CrudRepository;

import br.com.spring5.petclinic.model.Pet;

public interface PetService extends CrudRepository<Pet, Long> {

}
