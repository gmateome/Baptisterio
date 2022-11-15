/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.lasgabias.baptisteriolasgabias;

import java.time.Instant;
import java.util.ArrayList;

/**
 *
 * @author gmateome
 */
public class Event {
    
    ArrayList <Dates> dates =new ArrayList<Dates>();
    String eventName;
    
    public Event(String eventName){
        dates.add(new Dates(2022,11,01));
        dates.add(new Dates(2022,11,02));
        dates.add(new Dates(2022,11,03));
        dates.add(new Dates(2022,11,04));
        dates.add(new Dates(2022,11,05));
        dates.add(new Dates(2022,11,06));
        dates.add(new Dates(2022,11,07));
        this.eventName=eventName;
    }

    public ArrayList<Dates> getDates() {
        return dates;
    }

    public String getEventName() {
        return eventName;
    }
    
    
    
    
    
}
