/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package my.lasgabias.baptisteriolasgabias;

import java.util.Date;

/**
 *
 * @author gmateome
 */
public class BaptisterioLasGabias {

    public static void main(String[] args) {
        
        Event baptisterioLasGabias = new Event("Baptisterio de las gabias 2022");
        
        UI.hello(baptisterioLasGabias.getEventName());
        UI.showAvailability(baptisterioLasGabias.getDates());
        int whatToDo=UI.doNow();
        while(whatToDo!=3){
            switch(whatToDo){
                case 1:
                    UI.buyTickets(baptisterioLasGabias.getDates());
                break;
                case 2:
                    UI.showAvailability(baptisterioLasGabias.getDates());
                break;
            }
            whatToDo=UI.doNow();
        }
  
        
    }
}
