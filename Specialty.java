/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csu.csci325;

/**
 *
 * @author jojo
 */
public class Specialty extends Card {
    private String effect;
    private boolean canStack;
    
    public Specialty(String type, String color, String cEffect, boolean cStack){
        super(type, color);
        effect = cEffect;
        canStack = cStack;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("Effect: " + effect);
        System.out.println("Stackable: " + canStack);
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
    
    public void displayEffect(){
        switch(effect){
            case "Skip":
                System.out.println("Next player is skipped");
                break;
             
            case "Reverse":
                System.out.println("Play order is reversed");
                break;
            
            case "Draw2":
                System.out.println("Next Player draws 2 cards");
                break;
            case "Draw4":
                System.out.println(" Next Player draws 4 cards");
                break;
            case "Wild Card":
                System.out.println("Player picks a color");
                break;
            case "Wild Card4":
                System.out.println("Next Player draws four and current player chooses color");
                break;
        }
    }
}
