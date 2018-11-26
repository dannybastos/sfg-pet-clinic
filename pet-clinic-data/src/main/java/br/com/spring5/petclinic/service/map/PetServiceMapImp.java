package br.com.spring5.petclinic.service.map;

import br.com.spring5.petclinic.model.Pet;
import br.com.spring5.petclinic.service.PetService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("map")
@Service
@Primary
public class PetServiceMapImp extends AbstractServiceMap<Pet, Long> implements PetService {
}
