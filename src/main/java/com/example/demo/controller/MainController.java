package com.example.demo.controller;

import com.example.demo.service.TimeServiceImpl;

import java.util.*;

import com.example.demo.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * MainController
 * 
 */

@Controller
public class MainController {

    // La etiqueta Autowired para llamar al servicio TimeService
    @Autowired
    private TimeService ts;

    // etiquetas para trabajat en entorno web y directorio time 
    @GetMapping("/time")
    @ResponseBody
    public String time() {

        return ts.getTiempo();

    }

    // CREAMOS EL endpoint /edad


     // etiquetas para trabajar en entorno web y directorio edad 
     // Requestparam para introducir datos (localhost:8080/edad/?day= &mes= &año)
    @GetMapping("/edad")
    @ResponseBody  // lo que nos devuelve es directamente la resùesta - resultado
    public String CalcfechaNac(@RequestParam("day") String days, @RequestParam("month") String months,
            @RequestParam("year") String years) {
    // covertir los String a 

        int adays = Integer.parseInt(days); // 25
        int amonths = Integer.parseInt(months); // 12
        int ayears = Integer.parseInt(years); // 1988

        Calendar fechaNac = new GregorianCalendar();
        fechaNac.set(Calendar.YEAR, ayears);
        fechaNac.set(Calendar.MONTH, amonths);
        fechaNac.set(Calendar.DAY_OF_MONTH, adays);

        String resultado = " Si naciste el " + fechaNac.get(Calendar.DAY_OF_MONTH) + " / " + fechaNac.get(Calendar.MONTH) + " / " + fechaNac.get(Calendar.YEAR) + " , tu edad es de "
                + ts.calculaEdad((GregorianCalendar) fechaNac) + " años chavalote. ";
       // hemos hecho una casting de fechNac al poner delante (GregorianCalendar)  
       
       
       return resultado;
    
        
       
       
   }




}