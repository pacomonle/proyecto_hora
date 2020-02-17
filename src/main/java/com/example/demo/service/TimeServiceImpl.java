package com.example.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * TimeServiceImpl - creamos un servicio
 */

@Service
@RequestScope
public class TimeServiceImpl implements TimeService {

    private Calendar time; 
    
       
    @Override
    public String getTiempo() {    

        return  time.getTime().toString();
    }

   public TimeServiceImpl(){
     time = new GregorianCalendar(); 
   }

}