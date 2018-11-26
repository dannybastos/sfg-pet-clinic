package br.com.spring5.petclinic.service.map;

import br.com.spring5.petclinic.model.Speciality;
import br.com.spring5.petclinic.service.SpecialityService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("map")
@Service
@Primary
public class SpecialityServiceMapImp extends AbstractServiceMap<Speciality, Long> implements SpecialityService {

}
