/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.lasgabias.baptisteriolasgabias;


/**
 *
 * @author gmateome
 */
public class Ticket {
    
    int id;
    String location;
    int price;
    
    public Ticket(int id){
        id=this.id;
        location="Baptisterio las Gabias";
        price=4;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getPrice() {
        return price;
    }
    
    
    
}
