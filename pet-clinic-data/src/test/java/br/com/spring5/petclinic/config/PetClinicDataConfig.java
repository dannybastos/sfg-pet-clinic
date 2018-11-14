package br.com.spring5.petclinic.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by danny on 13/11/18.
 */

@Configuration
@ComponentScan(basePackages= {"br.com.spring5"})
public class PetClinicDataConfig {
}
