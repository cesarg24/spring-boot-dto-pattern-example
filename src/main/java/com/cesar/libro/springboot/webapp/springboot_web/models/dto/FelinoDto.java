package com.cesar.libro.springboot.webapp.springboot_web.models.dto;

import com.cesar.libro.springboot.webapp.springboot_web.models.Felino;

public class FelinoDto {
    Long codigo;
    String nombre;
    Integer edad;

    public FelinoDto(Felino felino) {
        this.codigo = felino.getCodigo();
        this.nombre = felino.getNombre();
        this.edad = felino.getEdad();
    }

    public Long getCodigo() {
        return codigo;
    }
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
