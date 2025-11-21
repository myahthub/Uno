/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csu.csci325;

/**
 *
 * @author jojo
 */
public class Card {
   
    private String type;
    private String color;
    
    public Card(String cType, String cColor){
        type = cType;
        color = cColor;
    }
    
    //Overloaded Constructor
    public Card(String cColor){
        type = "Default";
        color = cColor;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void display(){
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
    }
    
    //Overloading display method
    public void display(String name){
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Name : " + name);
    }
}


