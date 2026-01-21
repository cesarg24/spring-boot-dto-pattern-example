package com.cesar.libro.springboot.webapp.springboot_web.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesar.libro.springboot.webapp.springboot_web.models.Libro;
import com.cesar.libro.springboot.webapp.springboot_web.models.dto.LibroDto;

@RestController
public class LibroRestController {

    @GetMapping("/api/libro")
    public LibroDto libro(){

    Libro libro = new Libro(100L, "Java Spring Boot", "César", "McGrawHill", 2025);
    LibroDto libroDto = new LibroDto(libro, "¡Envío gratis hoy!");
    return libroDto;
    }

    @GetMapping("/api/libreria")
    public List<LibroDto> libreria(){

    List<Libro> libro = List.of( 
        new Libro(100L, "Java Spring Boot", "César", "McGrawHill", 2025),
        new Libro(101L, "Jakarta EE", "John", "Phillips", 2024),
        new Libro(102L, "React Front-End", "Taylor", "Hill", 2023)
    );

    List<LibroDto> libroDto = libro.stream()
        .map(librovar -> new LibroDto(librovar, "¡Envío gratis hoy!"))
        .collect(Collectors.toList());

    return libroDto;

    }
}
