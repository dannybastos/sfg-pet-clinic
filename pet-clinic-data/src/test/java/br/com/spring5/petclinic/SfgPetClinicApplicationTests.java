package br.com.spring5.petclinic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:context-test.xml")
public class SfgPetClinicApplicationTests {

	private Logger log = LoggerFactory.getLogger(getClass());
	@Test
	public void contextLoads() {
		log.info("HELLO WORLD!!!");
	}

}
