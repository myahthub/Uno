/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csu.csci325;

/**
 *
 * @author jojo
 */
public class Numbers extends Card{
    private int num;
    
    public Numbers(String type, String color, int number){
        super(type, color);
        num = number;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    @Override
    public void display(){
        super.display();
        System.out.println("Number: "+ num);
    }
}


