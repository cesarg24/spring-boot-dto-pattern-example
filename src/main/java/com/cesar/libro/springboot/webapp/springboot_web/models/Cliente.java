package com.cesar.libro.springboot.webapp.springboot_web.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "title", "name", "lastname" })
public class Cliente {
    
    private String title;
    private String name;
    private String lastname;

    public Cliente(String title, String name, String lastname) {
        this.title = title;
        this.name = name;
        this.lastname = lastname;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
