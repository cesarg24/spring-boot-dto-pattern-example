package com.cesar.libro.springboot.webapp.springboot_web.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UserController {
    //Pasar Datos a la vista con Model
    @GetMapping("/frase")
    public String vermensaje(Model model){
        model.addAttribute("llave", "Hola mundo, Mercurio!!.");
        model.addAttribute("titulo", "Bienvenidos");
        return "mensaje";
    }
}
