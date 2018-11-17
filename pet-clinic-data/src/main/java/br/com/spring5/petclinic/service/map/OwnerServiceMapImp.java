package br.com.spring5.petclinic.service.map;

import br.com.spring5.petclinic.model.Owner;
import br.com.spring5.petclinic.service.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceMapImp extends AbstractServiceMap<Owner, Long> implements OwnerService {
}
