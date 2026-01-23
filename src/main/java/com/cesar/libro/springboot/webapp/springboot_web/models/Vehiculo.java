package com.cesar.libro.springboot.webapp.springboot_web.models;


public class Vehiculo {

    private Long id;
    private String marca;
    private String color;
    private String year;

    public Vehiculo(Long id, String marca, String color, String year) {
        this.id = id;
        this.marca = marca;
        this.color = color;
        this.year = year;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
}
