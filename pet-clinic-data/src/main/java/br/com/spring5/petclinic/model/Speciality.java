package br.com.spring5.petclinic.model;

/**
 * Created by danny on 16/11/18.
 */
public class Speciality {

    private Long id;

    private String name;

    public Speciality() {
    }

    public Speciality(String name) {
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
}
