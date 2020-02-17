import java.util.Calendar;
import java.util.GregorianCalendar;
 
# OPCION 1

public class calcularEdad {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		// Mostramos el resultado de llamar a la función calcular pasando
		// como parametro la fecha de nacimiento YYYY-MM-DD
		System.out.println(calcular(new GregorianCalendar(1970,02,14)));
	}
 
    public static int calcular(Calendar fechaNac) {
        Calendar fechaActual = Calendar.getInstance();
 
        // Cálculo de las diferencias.
        int years = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);
 
        // Hay que comprobar si el día de su cumpleaños es posterior
        // a la fecha actual, para restar 1 a la diferencia de años,
        // pues aún no ha sido su cumpleaños.
 
        if(months < 0 // Aún no es el mes de su cumpleaños
           || (months==0 && days < 0)) { // o es el mes pero no ha llegado el día.
            years--;
        }
        return years;
    }
}




# OPCION 2

private int calculaEdad(Calendar fechaNac) {
        Calendar today = Calendar.getInstance();

        int diff_year = today.get(Calendar.YEAR) -  fechaNac.get(Calendar.YEAR);
        int diff_month = today.get(Calendar.MONTH) - fechaNac.get(Calendar.MONTH);
        int diff_day = today.get(Calendar.DAY_OF_MONTH) - fechaNac.get(Calendar.DAY_OF_MONTH);

        //Si está en ese año pero todavía no los ha cumplido
        if (diff_month < 0 || (diff_month == 0 && diff_day < 0)) {
            diff_year = diff_year - 1; //no aparecían los dos guiones del postincremento :|
        }
        return diff_year;
    }


# OPCION 3

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
@Autor: www.javerosanonimos.com
Twitter: @javerosanonimos
Facebook: www.facebook.com/JaverosAnonimos   
e-mail: javerosanonimos@gmail.com
**/
class CalculaFecha {
   public static void main(String []args){
//Accedemos al metodo estatico a través del nombre de nuestra clase
     System.out.println(CalculaFecha.calcularEdad("01-01-1999"));
/**Podemos quitar el static al metodo y se accedería así:
CalculaFecha cal= new CalculaFecha(); 
cal.calcularEdad("01-01-1999");*/
   }
//Este es el método calcularEdad que se manda a llamar en el main 
   public static Integer calcularEdad(String fecha){
   Date fechaNac=null;
       try {
           /**Se puede cambiar la mascara por el formato de la fecha 
           que se quiera recibir, por ejemplo año mes día "yyyy-MM-dd"
           en este caso es día mes año*/
           fechaNac = new SimpleDateFormat("dd-MM-yyyy").parse(fecha);
       } catch (Exception ex) {
           System.out.println("Error:"+ex);
       }
       Calendar fechaNacimiento = Calendar.getInstance();
       //Se crea un objeto con la fecha actual
       Calendar fechaActual = Calendar.getInstance();
       //Se asigna la fecha recibida a la fecha de nacimiento.
       fechaNacimiento.setTime(fechaNac);
       //Se restan la fecha actual y la fecha de nacimiento
       int año = fechaActual.get(Calendar.YEAR)- fechaNacimiento.get(Calendar.YEAR);
       int mes =fechaActual.get(Calendar.MONTH)- fechaNacimiento.get(Calendar.MONTH);
       int dia = fechaActual.get(Calendar.DATE)- fechaNacimiento.get(Calendar.DATE);
       //Se ajusta el año dependiendo el mes y el día
       if(mes<0 || (mes==0 && dia<0)){
           año--;
       }
       //Regresa la edad en base a la fecha de nacimiento
       return año;
   }
}

 