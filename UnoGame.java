/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csu.csci325;

import java.util.Random;

/**
 *
 * @author amyah
 */
public class UnoGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Set variables
       String[] colors = {"Red", "Blue", "Green", "Yellow"};
       String[] effects = {"Reverse", "Skip", "Draw 2", "WildCard Draw 4"};
       
       // Random Variable initialized
       Random random = new Random();
       
       // Deck of cards (Random)
       
       
       // Randon generator for colors
       int randColorIndex = random.nextInt(colors.length);
       String randomColor = colors[randColorIndex];
       
       // Random generator for numbers
       int randNum = (int)(Math.random() * 10);
       
       // Random generator for effects
       int randEffectsIndex = random.nextInt(effects.length);
       String randomEffects = effects[randEffectsIndex];
       
       //TESTING
       Numbers cardNum1 = new Numbers("Number", randomColor, randNum);
       cardNum1.display();
       System.out.println();
       
       Specialty card2 = new Specialty("Specialty", "None", randomEffects, false);
       card2.display();
       
       
        //stack
        //instanceof
    }
    
}
