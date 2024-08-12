package com.example.ejercicio.service.impl;

import com.example.ejercicio.service.INumero;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class Numero implements INumero {


    @Override
    public String escalera(int a) {
        for (int i = 1; i<=a; i++){
            String caracter = "*";
            String resultado = String.valueOf(caracter).repeat(i);
            System.out.println(resultado);
        }
        return "hola";
    }
}
