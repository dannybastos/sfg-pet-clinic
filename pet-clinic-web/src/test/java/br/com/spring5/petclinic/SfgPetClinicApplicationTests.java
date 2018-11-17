package br.com.spring5.petclinic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SfgPetClinicApplicationTests {

	Logger log = Logger.getLogger(getClass().getName());
	@Test
	public void contextLoads() {
		log.info("ok");
	}

}
