package com.seesckzimp.demo.entities;

public class Departament {
    private Long id;
    private String name;

    public Departament() {

    }
    public Departament(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
