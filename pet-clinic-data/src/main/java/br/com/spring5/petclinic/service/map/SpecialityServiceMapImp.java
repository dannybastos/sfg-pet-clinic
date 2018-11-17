package br.com.spring5.petclinic.service.map;

import br.com.spring5.petclinic.model.Speciality;
import br.com.spring5.petclinic.service.SpecialityService;
import org.springframework.stereotype.Service;

@Service
public class SpecialityServiceMapImp extends AbstractServiceMap<Speciality, Long> implements SpecialityService {

}
