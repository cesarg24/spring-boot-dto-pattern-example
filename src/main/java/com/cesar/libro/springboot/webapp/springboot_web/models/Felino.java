package com.cesar.libro.springboot.webapp.springboot_web.models;

public class Felino {

    Long codigo;
    String nombre;
    Integer edad;
    String color;
    String sexo;

    public Felino(Long codigo, String nombre, Integer edad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
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
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    
}
