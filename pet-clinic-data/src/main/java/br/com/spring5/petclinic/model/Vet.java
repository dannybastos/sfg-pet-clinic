package br.com.spring5.petclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 * Created by dannybastos on 01/11/18.
 */
@Entity
public class Vet extends Person {
	private static final long serialVersionUID = 88287483914776409L;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="VET_SPECIALITY")
    private Set<Speciality> specialities;

    public Vet() {
    	this.specialities = new HashSet<>();
    }

    public Vet(String firstName, String lastName) {
    	this();
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}

}
