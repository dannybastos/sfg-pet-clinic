package br.com.spring5.petclinic.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * Created by danny on 16/11/18.
 */
@Entity
public class Speciality implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", length = 100)
    private String name;
    
    @ManyToMany(mappedBy="specialities")
    private Set<Vet> vets;

    public Speciality() {
    	vets = new HashSet<>();
    }

    public Speciality(String name) {
        this();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public Set<Vet> getVets() {
		return vets;
	}

	public void setVets(Set<Vet> vet) {
		this.vets = vet;
	}
}
