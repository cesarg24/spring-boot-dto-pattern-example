package com.cesar.libro.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesar.libro.springboot.webapp.springboot_web.models.Vehiculo;
import com.cesar.libro.springboot.webapp.springboot_web.models.dto.VehiculoDto;

@RestController
public class VehiculoRestController {

    @GetMapping("/vehiculo")
    public Map<String, Object> transporte(){

        Map<String, Object> obj = new HashMap<>();
        obj.put("id", "100");
        obj.put("marca", "Nissan");
        obj.put("color", "Rojo");
        obj.put("year", "2025");
        
        return obj;
    }
    @GetMapping("/vehiculo2")
    public VehiculoDto transporte2(){

        Vehiculo obVehiculo = new Vehiculo(100L, "Toyota", "azul", "2204");
        VehiculoDto objvehiculoDto = new VehiculoDto(obVehiculo);
        
        return objvehiculoDto;
    }
    @GetMapping("/listavehiculo")
    public List<VehiculoDto> transporte3(){

        List<Vehiculo> obVehiculo = List.of(
            new Vehiculo(100L, "Toyota", "azul", "2023"),
            new Vehiculo(101L, "Nissan", "blanco", "2022"),
            new Vehiculo(102L, "Kia", "rojo", "2013"),
            new Vehiculo(103L, "Ford", "verde", "2018")
        );
        
        List<VehiculoDto> objvehiculoDto = obVehiculo.stream()
            //.map(lista -> new VehiculoDto(lista))
            .map(VehiculoDto::new)
            .collect(Collectors.toList());
        
        return objvehiculoDto;
    }



}
