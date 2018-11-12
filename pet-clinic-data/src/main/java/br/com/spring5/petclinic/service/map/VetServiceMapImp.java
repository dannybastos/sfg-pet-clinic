package br.com.spring5.petclinic.service.map;

import org.springframework.stereotype.Service;

import br.com.spring5.petclinic.model.Vet;
import br.com.spring5.petclinic.service.VetsService;

@Service
public class VetServiceMapImp extends AbstractServiceMap<Vet, Long> implements VetsService {

}
