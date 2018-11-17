package br.com.spring5.petclinic.service.map;

import br.com.spring5.petclinic.model.Pet;
import br.com.spring5.petclinic.service.PetService;
import org.springframework.stereotype.Service;

@Service
public class PetServiceMapImp extends AbstractServiceMap<Pet, Long> implements PetService {

}
