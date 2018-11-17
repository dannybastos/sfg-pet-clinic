package br.com.spring5.petclinic.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dannybastos on 01/11/18.
 */
public class Owner extends Person {

    private String address;
    private String city;
    private Long telephone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
