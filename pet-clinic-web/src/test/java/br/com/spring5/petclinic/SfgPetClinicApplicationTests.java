package br.com.spring5.petclinic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SfgPetClinicApplicationTests {

	Logger log = LoggerFactory.getLogger(getClass().getName());
	@Test
	public void contextLoads() {
		log.info("ok");
	}

}
