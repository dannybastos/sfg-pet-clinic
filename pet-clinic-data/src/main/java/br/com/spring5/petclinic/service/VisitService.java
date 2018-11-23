package br.com.spring5.petclinic.service;

import br.com.spring5.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitService extends CrudRepository<Visit, Long> {
}
