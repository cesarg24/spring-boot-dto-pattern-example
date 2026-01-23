package com.cesar.libro.springboot.webapp.springboot_web.models.dto;

import com.cesar.libro.springboot.webapp.springboot_web.models.Usuario;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"cedula","nombre", "apellido"})
public class UsuarioDto {

    private Long cedula;
    private String nombre;
    private String apellido;

    public UsuarioDto(Usuario user) {
        this.cedula = user.getCedula();
        this.nombre = user.getNombre();
        this.apellido = user.getApellido();
    }

    public Long getCedula() {
        return cedula;
    }
    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}
