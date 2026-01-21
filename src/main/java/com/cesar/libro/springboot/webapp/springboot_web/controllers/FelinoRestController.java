package com.cesar.libro.springboot.webapp.springboot_web.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesar.libro.springboot.webapp.springboot_web.models.Felino;
import com.cesar.libro.springboot.webapp.springboot_web.models.dto.FelinoDto;

@RestController
public class FelinoRestController {

    @GetMapping("/api/felino")
    public List<FelinoDto> Felino(){

    List<Felino> objList = List.of(
        new Felino(100L, "León", 14),
        new Felino(101L, "Oso", 15),
        new Felino(102L, "Pantera", 14),
        new Felino(103L, "Gato", 10),
        new Felino(104L, "tigre", 14)
    );

    List<FelinoDto> objListDto = objList.stream()
    //.map(felino -> new FelinoDto(felino))
    .map(FelinoDto::new)
    .collect(Collectors.toList());
    
    return objListDto;

 }
}
