package br.com.spring5.petclinic.model;

import javax.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * Created by dannybastos on 01/11/18.
 */
@Entity
@TableGenerator(name="TAB_SEQ", initialValue=1, allocationSize=1)
public class Pet implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="TAB_SEQ")
    private Long id;
	
    @Column(name="name", length = 100)
    private String name;

    @Column(name="birth_date")
    private LocalDate birthDate;
    
    @Enumerated(EnumType.ORDINAL)
    private PetType type;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    private Owner owner;

    public Pet() {
    }

    public Pet(String name, LocalDate birthDate, PetType type, Owner owner) {
        this.name = name;
        this.birthDate = birthDate;
        this.type = type;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getType() {
        return type;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
