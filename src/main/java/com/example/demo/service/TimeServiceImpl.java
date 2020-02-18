package com.example.demo.service;


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
/* constructor
   public TimeServiceImpl(){
     time = new GregorianCalendar(); 
   }
*/


// implementamos el metodo calculaEdad y el atributo tipo Calendar fechaNac 
 


   @Override
   public int calculaEdad(GregorianCalendar fechaNac) {
    
    

 // calculaEdad es un metodo que devuelve un entero y tiene como variable un Calendar   
// creamos la variable fechaActual (conocida) que es del tipo Calendar     
  
  Calendar fechaActual = Calendar.getInstance();

 // calculo de las diferencias entre fechaActual y fechaNac nos dara la edad  
   
   int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
   int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
   int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);

 // AHORA CON UN IF COMPROBAMOS LA SIGUIENTE CONDICION:  
// Hay que comprobar si el día de su cumpleaños es posterior
// a la fecha actual, para restar 1 a la diferencia de años,
// pues aún no ha sido su cumpleaños.

   if(months < 0 // Aún no es el mes de su cumpleaños
  || (months==0 && days < 0)) { // o es el mes pero no ha llegado el día.
    years = years - 1;
   }

// Si no se cumple la condicion entonces return la variable years claculada inicialmente   
   return years;
  }
  
// Constructor haz dejarlo por defecto
  
  public TimeServiceImpl() {
    time = new GregorianCalendar(); 
   // GregorianCalendar fechaNac = new GregorianCalendar(); ya esta introducida comoparametro en el metodo
  }


 
  
  

}