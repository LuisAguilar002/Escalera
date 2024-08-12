package com.example.ejercicio.controller;


import com.example.ejercicio.Model.NumeroModelo;
import com.example.ejercicio.service.impl.Numero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class NumeroController {

    @Autowired
    private Numero numeroService;

    @PostMapping("numero/{numero}")
    public ResponseEntity<String> procesarNumero(@RequestBody NumeroModelo numeroModelo){
        int numero = numeroModelo.getA();
        try {
            if (numero<0){
                return ResponseEntity.badRequest().body("Número no puede ser negativo: " + numero);
            }
        } catch (NumberFormatException e){
            return ResponseEntity.badRequest().body("No es un número válido: " + numero);
        }
        numeroService.escalera(numero);
        return ResponseEntity.ok("Número recibido: " + numero);
    }
}
