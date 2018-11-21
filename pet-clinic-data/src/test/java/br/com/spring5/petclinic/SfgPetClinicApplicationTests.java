package br.com.spring5.petclinic;

import br.com.spring5.petclinic.config.PetClinicDataConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=PetClinicDataConfig.class)
public class SfgPetClinicApplicationTests {

	Logger log = LoggerFactory.getLogger(getClass().getName());
	@Test
	public void contextLoads() {
		log.info("HELLO WORLD!!!");
	}

}
