package br.com.spring5.petclinic.service;

import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.spring5.petclinic.config.PetClinicDataConfig;
import br.com.spring5.petclinic.model.Vet;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes=PetClinicDataConfig.class)
@ActiveProfiles("map")
public class VetsServiceTest {
	
	private VetsService vetService;
	
	@Autowired
	public void setVetService(VetsService vetService) {
		this.vetService = vetService;
	}

	@Before
	public void setup() {
		Vet vet = new Vet();
		vet.setFirstName("fistName");
		vet.setLastName("lastName");
		vet = vetService.save(vet);
	}
	
	@Test
	public void testFindById() {
		Optional<Vet> vet = vetService.findById(1l);
		assertTrue(vet.isPresent());
	}

	@Test
	public void testFindAll() {
		Collection<Vet> lst = (Collection<Vet>) vetService.findAll();
		assertTrue(lst.size() > 0);
	}

	@Test
	public void testDelete() {
		vetService.deleteById(1l);
	}

}
