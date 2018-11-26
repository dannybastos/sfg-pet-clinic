package br.com.spring5.petclinic.service.map;

import br.com.spring5.petclinic.model.Visit;
import br.com.spring5.petclinic.service.VisitService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("map")
@Primary
public class VisitServiceMapImp extends AbstractServiceMap<Visit, Long> implements VisitService {
}
