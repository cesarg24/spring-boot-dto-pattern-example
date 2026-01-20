package com.cesar.libro.springboot.webapp.springboot_web.controllers;


import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cesar.libro.springboot.webapp.springboot_web.models.Cliente;
import com.cesar.libro.springboot.webapp.springboot_web.models.dto.ClienteDto;

@RestController
public class ClienteRestController {

    @GetMapping("/cliente")
    public Map<String, Object> cliente(){
        Map<String, Object> body = new HashMap<>();
        Cliente cli = new Cliente("Clientes de Amazon", "Jhon", "Smith");
        body.put("cli",cli);
        body.put("title", "Bienvenidos");

        return body;
    }

@GetMapping("/cliente-dto")
public ClienteDto clientedto() {
        Cliente clienteOriginal = new Cliente("Ing.", "John", "More");
        // El constructor del DTO se encargará de sacar solo el nombre
        ClienteDto cliDto = new ClienteDto("cesar@gmail.com", clienteOriginal);
        return cliDto;
    }
}
