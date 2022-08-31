package com.example.demo.Service;

import com.example.demo.Models.Clima;
import org.springframework.stereotype.Service;

@Service
public class Services {

    public Integer getRecursividad() {
        Integer numero = 5;
        numerosDesendientes(numero);
        numerosAcendentes(numero);
        return numero;
    }

    public Clima getClima(){
        Clima clima = new Clima();
        clima.setEstado("Soleado");
        clima.setTemperaturaMax(38);
        clima.setTemperaturaMin(26);
        return clima;
    }

    public void numerosDesendientes(Integer x) {
        if (x>0) {
            System.out.println(x);
            numerosDesendientes(x-1);
        }
    }
     void numerosAcendentes(int x) {
        if (x>0) {
            numerosAcendentes(x-1);
            System.out.println(x);
        }
    }
    public int factorial(int fact) {
        if (fact>0) {
            int valor=fact * factorial(fact-1);
            return valor;
        }
            return 1;
    }



}
