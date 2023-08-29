package com.postman.test.controller;

import com.postman.test.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
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
    
    @GetMapping("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes(){
        
        List<Cliente> clientList = new ArrayList<>();
        clientList.add(new Cliente(1l, "Leo", "Messi"));
        clientList.add(new Cliente(2l, "Cristiano", "Ronaldo"));
        clientList.add(new Cliente(3l, "Neymar", "Santos"));
        
        return clientList ;
    }
    
    @GetMapping("/customresponse")
    public ResponseEntity<String> custom() {
        return new ResponseEntity<>("Request exitosa!!!", HttpStatus.NOT_FOUND);
    }
    
}
