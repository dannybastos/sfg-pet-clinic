package br.com.spring5.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

/**
 * Created by dannybastos on 01/11/18.
 */
@Entity
@Getter
@Setter
public class Vet extends Person {
	private static final long serialVersionUID = 88287483914776409L;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="VET_SPECIALITY")
    private Set<Speciality> specialities;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vet", cascade = CascadeType.ALL)
	private Set<Visit> visits;

    public Vet() {
    	this.specialities = new HashSet<>();
    }

    public Vet(String firstName, String lastName) {
    	this();
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }
}
