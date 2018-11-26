package br.com.spring5.petclinic.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

/**
 * Created by dannybastos on 01/11/18.
 */
@Entity
@Getter
@Setter
public class Pet implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @Column(name="name", length = 100)
    private String name;

    @Column(name="birth_date")
    private LocalDate birthDate;
    
    @Enumerated(EnumType.ORDINAL)
    private PetType type;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Owner owner;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="pet")
    private Set<Visit> visits;
    
    public Pet() {
    }

    public Pet(String name, LocalDate birthDate, PetType type, Owner owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.type = type;
        this.owner = owner;
    }
}
