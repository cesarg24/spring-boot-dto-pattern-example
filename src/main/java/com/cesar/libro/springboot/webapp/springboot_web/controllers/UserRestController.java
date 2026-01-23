package com.cesar.libro.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesar.libro.springboot.webapp.springboot_web.models.Cliente;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/datosuser")
    public Map<String, Object> avisouser(){
        
        Map<String, Object> body = new HashMap<>();
        body.put("id", "100200");
        body.put("name", "Cesar");
        body.put("title", "Av. San Vicente");
        return body;
    }

    @GetMapping("/user")
    public Cliente user(){
        
        Cliente cli = new Cliente("Clientes de Amazon", "Jhon", "Smith");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Esto no se devuelve");
        body.put("cliente", cli); 
        
        return cli;
    }
    
}
