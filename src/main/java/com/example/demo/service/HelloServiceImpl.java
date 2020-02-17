package com.example.demo.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.fasterxml.jackson.annotation.JsonValue;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * HelloService - creamos un servicio
 */

@Service

public class HelloServiceImpl implements HelloService {

    @Value(value = "${mi.nombre}")
    private String miNombre;
    private String saludo;

    @Override
    public String hola() {
        
        
            return saludo + " , soy " + miNombre;
    
        
        
    }

    public HelloServiceImpl() {
        saludo = "Hola holita";

        Calendar c = new GregorianCalendar();
        c.getTime().toString();

    }

}
