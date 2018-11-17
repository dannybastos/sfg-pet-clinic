package br.com.spring5.petclinic.model;

/**
 * Created by dannybastos on 01/11/18.
 */
public class Vet extends Person {

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
