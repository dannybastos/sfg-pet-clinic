package br.com.spring5.petclinic.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

/**
 * Created by dannybastos on 01/11/18.
 */
@Entity
public class Vet extends Person {
	private static final long serialVersionUID = 88287483914776409L;
	
	@ManyToOne(fetch = FetchType.LAZY)
    private Speciality speciality;

    public Vet() {
    }

    public Vet(String firstName, String lastName, Speciality speciality) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.speciality = speciality;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
