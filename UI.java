/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.lasgabias.baptisteriolasgabias;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gmateome
 */
public class UI {
    
    public UI(){}
    
    public static void hello(String event){
        System.out.println("Bienvenido al sistema de venta de antradas de "+event);
        System.out.println("************************************************************************");
    }
    
    public static void showAvailability(ArrayList <Dates> dates){
        System.out.println("Estas son las entradas disponibles:");
        for(Dates d: dates){
            System.out.println(d.getDate()+": "+d.getAvailability());
        }
        System.out.println("************************************************************************");
    }
    
    public static int doNow(){
        System.out.println("Que desea hacer ahora?  1:Comprar entradas  2:Mostrar disponibilidad    3:Salir");
        Scanner entrada=new Scanner(System.in);        
        String option=entrada.nextLine().toLowerCase();
        while(!option.equals("1")&&!option.equals("2")&&!option.equals("3")){
            System.out.println("Introduzca una opcion valida:");
            option=entrada.nextLine().toLowerCase();
        }
        return parseInt(option);
    }
    
    public static void buyTickets(ArrayList <Dates> dates){
        System.out.println("Introduzca la fecha para la que desea obtener sus entradas: (dd/MM/yyyy)");
        Scanner entrada=new Scanner(System.in);        
        String date=entrada.nextLine().toLowerCase();
        boolean valid=false;
        Dates selectedDate=new Dates();
        for(Dates d: dates){
            if(d.getDate().equals(date)){
                valid=true;
                selectedDate = d;
            }
        }
        while(valid==false){
            System.out.println("No se encontraron entradas para la fecha especificada. Introduzca una nueva fecha (dd/MM/yyyy)");
            date=entrada.nextLine().toLowerCase();    
            for(Dates d: dates){
                if(d.getDate().equals(date)){
                    valid=true;
                    selectedDate = d;
                }
            }
        }
        System.out.println("Introduzca la cantidad de entradas que desea. (Disponibles:"+selectedDate.getAvailability()+")");
        String quantity=entrada.nextLine().toLowerCase();
        valid=false;
        String reason="";
        try{
            if(parseInt(quantity)<=selectedDate.getAvailability()){
                valid=true;
                if(parseInt(quantity)<=0){
                    valid=false;
                    reason="Cantidad no válida";
                }
            }else{
                reason="Cantidad de entradas no disponible";
            }           
        }catch(Exception e){
            reason="Cantidad no válida";
        }
        while(reason.equals("Cantidad no válida")&&valid==false){
            System.out.println(reason+". Introduzca un valor valido");
            quantity=entrada.nextLine().toLowerCase();
            try{
                if(parseInt(quantity)<=selectedDate.getAvailability()){
                    valid=true;
                    if(parseInt(quantity)<=0){
                        valid=false;
                        reason="Cantidad no válida";
                    }
                }else{
                    reason="Cantidad de entradas no disponible";
                }           
            }catch(Exception e){
            reason="Cantidad no válida";
            }
        }
        if(valid==false){
            System.out.println(reason+". Que desea hacer?: 1:Seleccionar otra fecha 2:Volver al inicio");
            String option="1";
            option=entrada.nextLine().toLowerCase();
            while(!option.equals("1")&&!option.equals("2")){
                System.out.println("Opcion no valida");
                option=entrada.nextLine().toLowerCase();
            }
            if(option.equals("1")){
                UI.buyTickets(dates);
            }
        }else{
            int price=parseInt(quantity)*selectedDate.getTickets().get(0).getPrice();
            System.out.println("Precio: "+price+"€. Introduzca el importe exacto o el sistema le redirigirá a inicio.");
            String cash=entrada.nextLine().toLowerCase();
            try{
                if(parseInt(cash)==price){
                    selectedDate.setAvailability(selectedDate.getAvailability()-parseInt(quantity));
                    System.out.println("Enhorabuena, ha adquirido sus entradas.");
                }else{
                    System.out.println("Cantidad erronea");
                }
            }catch(Exception e){
                System.out.println("Cantidad erronea");
            }
            
        }       
    }    
}
