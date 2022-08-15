/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author daniel
 */
public class controladorReloj {
    
    String hora,min,seg;

    public String calcula(){
        Calendar calendario=new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        String ampm = calendario.get(Calendar.AM_PM)== Calendar.AM?"AM":"PM";
        if(ampm.equals("PM")){
            int h=calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora = h>9?""+h:"0"+h;
        }else{
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        min = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        seg = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
        
        
        return hora+":"+min+":"+seg;
    }
    
    public String calFecha(){
        Calendar fecha=new GregorianCalendar();
        
        String anho=Integer.toString(fecha.get(Calendar.YEAR));
        String mes="";
        String dia=Integer.toString(fecha.get(Calendar.DATE));
        String diaS="";
        
        switch((fecha.get(Calendar.DAY_OF_WEEK))){
            case 1:
                diaS="Domingo";
                break;
            case 2:
                diaS="Lunes";
                break;
            case 3:
                diaS="Martes";
                break;
            case 4:
                diaS="Miercoles";
                break;
            case 5:
                diaS="Jueves";
                break;
            case 6:
                diaS="Viernes";
                break;
            case 7:
                diaS="Sabado";
                break;
        }
        
        switch((fecha.get(Calendar.MONTH))){
            case 1:
                mes="Enero";
                break;
            case 2:
                mes="Febrero";
                break;
            case 3:
                mes="Marzo";
                break;
            case 4:
                mes="Abril";
                break;
            case 5:
                mes="Mayo";
                break;
            case 6:
                mes="Junio";
                break;
            case 7:
                mes="Julio";
                break;
            case 8:
                mes="Agosto";
                break;
            case 9:
                mes="Septiembre";
                break;
            case 10:
                mes="Octubre";
                break;
            case 11:
                mes="Noviembre";
                break;
            case 12:
                mes="Diciembre";
                break;
        }
        
        return diaS+", "+dia+" de "+mes+" de "+anho;
    }
    
}

