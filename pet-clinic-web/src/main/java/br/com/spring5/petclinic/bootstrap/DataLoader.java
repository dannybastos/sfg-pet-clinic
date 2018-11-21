package br.com.spring5.petclinic.bootstrap;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.spring5.petclinic.model.Owner;
import br.com.spring5.petclinic.model.Pet;
import br.com.spring5.petclinic.model.PetType;
import br.com.spring5.petclinic.model.Speciality;
import br.com.spring5.petclinic.model.Vet;
import br.com.spring5.petclinic.service.OwnerService;
import br.com.spring5.petclinic.service.PetService;
import br.com.spring5.petclinic.service.SpecialityService;
import br.com.spring5.petclinic.service.VetsService;

/**
 * Created by danny on 16/11/18.
 */
@Component
public class DataLoader implements CommandLineRunner {

    final private Logger logger = LoggerFactory.getLogger(getClass());

    final private OwnerService ownerService;
    final private VetsService vetService;
    final private SpecialityService specialityService;
    final private PetService petService;

    public DataLoader(OwnerService ownerService
            , VetsService vetService
            , SpecialityService specialityService
            , PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.specialityService = specialityService;
        this.petService = petService;
    }

    @Override
    public void run(String... args) throws Exception {
        final Collection<Pet> pets = (Collection<Pet>) petService.findAll();
        if (pets.size() == 0) {
            loadData();
        }
    }

    private void loadData() {
        logger.info("Loading data started ...");
        final Owner owner = new Owner("John", "Rambo", "address", "SP", 92981114850l);
        final Pet pet = new Pet("Bob", LocalDate.of(2010, Month.FEBRUARY, 12), PetType.DOG, owner);

        owner.getPets().add(pet);
        petService.save(pet);
        ownerService.save(owner);

        final Speciality speciality = new Speciality("Radiolity");
        specialityService.save(speciality);

        final Vet vet = new Vet("Rick", "Saint", speciality);
        vetService.save(vet);
        logger.info("Loading data finished!");
    }
}
