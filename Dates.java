/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.lasgabias.baptisteriolasgabias;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gmateome
 */
public class Dates {
    
    ArrayList <Ticket> tickets=new ArrayList<Ticket>();
    int year;
    int month;
    int day;
    String date;
    int availability;
    
    public Dates(){}
    
    public Dates(int year, int month, int day){
        tickets.add(new Ticket(0));
        tickets.add(new Ticket(1));
        tickets.add(new Ticket(2));
        tickets.add(new Ticket(3));
        tickets.add(new Ticket(4));
        tickets.add(new Ticket(5));
        tickets.add(new Ticket(6));
        tickets.add(new Ticket(7));
        tickets.add(new Ticket(8));
        tickets.add(new Ticket(9));        
        this.year=year;
        this.month=month;
        this.day=day;
        date=day+"/"+month+"/"+year;
        availability=10;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getDate() {
        return date;
    }

    public int getAvailability() {
        return availability;
    }
    
    public void setAvailability(int availability){
        this.availability=availability;
    }
    
}
