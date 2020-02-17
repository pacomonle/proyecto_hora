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

    @Autowired
    private TimeService ts;

    @GetMapping("/time")
    @ResponseBody
    public String time() {

        return ts.getTiempo();

    }

    // CREAMOS EL endpoint /edad

    @Autowired
    private TimeService ce;

    @GetMapping("/edad")
    @ResponseBody
    public String CalcfechaNac(@RequestParam(" day ") String days, @RequestParam(" month ") String months,
            @RequestParam(" year ") String years) {

        int adays = Integer.parseInt(days); // 25
        int amonths = Integer.parseInt(months); // 12
        int ayears = Integer.parseInt(years); // 1988

        Calendar fechaNac = new GregorianCalendar();
        fechaNac.set(Calendar.YEAR, ayears);
        fechaNac.set(Calendar.MONTH, amonths);
        fechaNac.set(Calendar.DAY_OF_MONTH,adays);

        String resultado = " Si naciste el 25-12.-19888 , tu edad es "
                + ce.calculaEdad((GregorianCalendar) fechaNac);
        
       
       
       return resultado;
    
        
       
       
   }




}