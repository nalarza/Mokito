package com.example.demo.Controller;

import com.example.demo.Models.Clima;
import com.example.demo.Models.Recursividad;
import com.example.demo.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @Autowired
    private Services services;

    @GetMapping("/api/prueba")
    public Clima getClima(){
        return services.getClima();
    }
    @GetMapping("/api/ejercicio")
    public Integer getrecursividad(){
        return services.getRecursividad();
    }
    @PostMapping("/api/factorial")
    public Integer getFactorial(@RequestParam Integer fact){
        return services.factorial(fact);
    }
}
