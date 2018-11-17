package br.com.spring5.petclinic;

import br.com.spring5.petclinic.config.PetClinicDataConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=PetClinicDataConfig.class)
public class SfgPetClinicApplicationTests {

	Logger log = Logger.getLogger(getClass().getName());
	@Test
	public void contextLoads() {
		log.info("HELLO WORLD!!!");
	}

}
