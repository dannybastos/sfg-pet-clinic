package br.com.spring5.petclinic.model;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

@Data
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
}