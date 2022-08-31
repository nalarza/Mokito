package com.example.demo.Controller;

import com.example.demo.Models.Clima;
import com.example.demo.Service.Services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ControladorTest {

    @InjectMocks
    private Controlador controlador;

    @Mock
    private Services services;

    @Test
    public void getClima(){
        Clima clima = new Clima();
        clima.setTemperaturaMin(8);
        clima.setTemperaturaMax(15);
        clima.setEstado("Nublado");
        when(services.getClima()).thenReturn(clima);
        controlador.getClima();
        verify(services,times(1)).getClima();
    }

}
