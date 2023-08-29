package com.postman.test.controller;

import com.postman.test.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class appController {
    
    @GetMapping
    public String inicio(){
        return "Probando POSTMAN";
    }
    
    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
        
        System.out.println("Cliente creado");
        System.out.println("Nombre: " + cli.getNombre());
        System.out.println("Apellido: " + cli.getApellido());
        
        
    }
}
