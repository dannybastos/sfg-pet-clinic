package br.com.spring5.petclinic.service.map;

import br.com.spring5.petclinic.model.Owner;
import br.com.spring5.petclinic.service.OwnerService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("map")
@Service
@Primary
public class OwnerServiceMapImp extends AbstractServiceMap<Owner, Long> implements OwnerService {
}
