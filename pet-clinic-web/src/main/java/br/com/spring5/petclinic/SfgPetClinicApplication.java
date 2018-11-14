package br.com.spring5.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="br.com.spring5.petclinic")
public class SfgPetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgPetClinicApplication.class, args);
	}
}
