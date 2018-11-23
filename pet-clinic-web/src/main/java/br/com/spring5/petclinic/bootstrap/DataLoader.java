package br.com.spring5.petclinic.bootstrap;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import br.com.spring5.petclinic.model.*;
import br.com.spring5.petclinic.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
    final private VisitService visitService;

    public DataLoader(OwnerService ownerService
            , VetsService vetService
            , SpecialityService specialityService
            , PetService petService
            , VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.specialityService = specialityService;
        this.petService = petService;
        this.visitService = visitService;
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

        Speciality speciality = new Speciality("Radiolity");
        Vet vet = new Vet("Rick", "Saint");
        vet = vetService.save(vet);
        vet.getSpecialities().add(speciality);
        speciality.getVets().add(vet);
        speciality = specialityService.save(speciality);
        vet.getSpecialities().add(speciality);
        vet = vetService.save(vet);

        Visit visit = new Visit(LocalDate.of(2018,Month.NOVEMBER, 22),"description", pet, vet);
        visitService.save(visit);
        logger.info("Loading data finished!");
    }
}
