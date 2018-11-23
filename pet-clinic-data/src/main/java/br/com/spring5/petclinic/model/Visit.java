package br.com.spring5.petclinic.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Entity
public class Visit implements Serializable{
	private static final long serialVersionUID = -3358724098419861060L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="date")
	private LocalDate date;

	@Column(name="description", length=100)
	private String description;

	@ManyToOne
	private Pet pet;

	public Vet getVet() {
		return vet;
	}

	public void setVet(Vet vet) {
		this.vet = vet;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	private Vet vet;

	public Visit() { }
	
	public Visit(LocalDate date, String description, Pet pet, Vet vet) {
		this();
		this.date = date;
		this.description = description;
		this.pet = pet;
		this.vet = vet;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
}