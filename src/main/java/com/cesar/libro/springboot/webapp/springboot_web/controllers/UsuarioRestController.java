package com.cesar.libro.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesar.libro.springboot.webapp.springboot_web.models.Usuario;
import com.cesar.libro.springboot.webapp.springboot_web.models.dto.UsuarioDto;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@RestController
@JsonPropertyOrder({"cedula","nombre", "apellido", "edad"})
public class UsuarioRestController {

    @GetMapping("/usuarios")
    public Map<String, Object> usuarios1(){

        Map<String, Object> body = new HashMap<>();
        body.put("cedula", "100200");
        body.put("nombre", "Juan");
        body.put("apellido", "Perez");
        body.put("edad", "36");

        return body;
    }

    @GetMapping("/usuarios2")
    public Usuario usuarios2(){
        Usuario body = new Usuario(100L, "Carlos", "Mafla", "34");
        return body;
    }

    @GetMapping("/usuarios3")
    public List<Usuario> usuarios3(){
        List<Usuario> body = List.of(
         new Usuario(100L, "Carlos", "Mafla", "34"),
         new Usuario(101L, "Cesar", "Ruiz", "33"),
         new Usuario(102L, "Luis", "Sanchez", "24")
        );
        return body;
    }

    @GetMapping("/usuarios4")
    public List<UsuarioDto> usuarios4(){
        
        List<Usuario> body = List.of(
         new Usuario(100L, "Karol", "Moe", "18"),
         new Usuario(101L, "Maria", "Doe", "22"),
         new Usuario(102L, "Rita", "Perez", "25")
        );

         List<UsuarioDto> bodyDto = body.stream()
         //.map(UsuarioDto::new)
         .map(varlist -> new UsuarioDto(varlist))
         .collect(Collectors.toList());
        return bodyDto;
    }




}
