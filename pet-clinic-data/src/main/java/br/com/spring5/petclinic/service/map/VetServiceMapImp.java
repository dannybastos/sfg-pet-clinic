package br.com.spring5.petclinic.service.map;

import br.com.spring5.petclinic.model.Vet;
import br.com.spring5.petclinic.service.VetsService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("map")
@Primary
public class VetServiceMapImp extends AbstractServiceMap<Vet, Long> implements VetsService {
}
