package br.com.spring5.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * Created by dannybastos on 01/11/18.
 */
@Entity
@Getter
@Setter
public class Owner extends Person {
	private static final long serialVersionUID = 6951042995564731837L;
	@Column(name="address", length = 100)
    private String address;
	
    @Column(name="city", length = 100)
    private String city;
    
    @Column(name="telephone")
    private Long telephone;
    
    @OneToMany(mappedBy="owner")
    private Set<Pet> pets;

    public Owner(String firstName, String lastName, String address, String city, Long telephone) {
        this();
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
    }

    public Owner() {
        this.pets = new HashSet<>();
    }

}
