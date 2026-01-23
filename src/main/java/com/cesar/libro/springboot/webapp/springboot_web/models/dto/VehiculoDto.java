package com.cesar.libro.springboot.webapp.springboot_web.models.dto;

import com.cesar.libro.springboot.webapp.springboot_web.models.Vehiculo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"id", "marca", "color", "year"})
public class VehiculoDto {

    private Long id;
    private String marca;
    private String color;

    public VehiculoDto(Vehiculo vehiculo) {
        this.id = vehiculo.getId();
        this.marca = vehiculo.getMarca();
        this.color = vehiculo.getColor();
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
}
