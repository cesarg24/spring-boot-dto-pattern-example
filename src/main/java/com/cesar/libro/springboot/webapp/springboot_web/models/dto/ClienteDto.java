package com.cesar.libro.springboot.webapp.springboot_web.models.dto;

import com.cesar.libro.springboot.webapp.springboot_web.models.Cliente;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({ "name", "name" })
public class ClienteDto {

    private String email;
    private String name;

    public ClienteDto(String email, Cliente cliente) {
        this.email = email;
        this.name = cliente.getName();
        
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
