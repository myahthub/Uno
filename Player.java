/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csu.csci325;

import java.util.Stack;

/**
 *
 * @author jojo
 */
public class Player {
    private String name;
    private Stack<Card> cardList = new Stack<Card>();

    public Player(String name){
        this.name = name;
    
<<<<<<< HEAD
    private Stack<Card> cardList = new Stack<Card>();

    
    public Player(String name){
    this.name = name;
    
}

=======
    }
    
>>>>>>> 4474556825c4edd8de9cc5356d15e7f2e27365c4
    // Get Name
    public String getName(){
        return name;
    }
    
    // Add card to player
    public void drawCard(Card card){
        cardList.push(card);
    }
    
<<<<<<< HEAD
    // Remove card from player
    public void showHand(){
=======
    // Show Player's hand
    public static void showHand(Stack<Card> list, String name, Card card){
        list.push(card);
        System.out.println(name);
        card.display();
    }
    
    
    /*public void showHand(){
>>>>>>> 4474556825c4edd8de9cc5356d15e7f2e27365c4
        System.out.println(name + "'s " + "Deck:");
        for (Card card : cardList){
            card.display();
            System.out.println(" ");
        }
<<<<<<< HEAD
    }
}
    //Check player's cards 
=======
    }*/
    
    // Possible ways to do this class:
    // Stack
    // Using instanceof
    
    // One way we could have the player pick the card is to pick the first 
    // element in the stack and pop off the first one and have it go down to 0
} 
>>>>>>> 4474556825c4edd8de9cc5356d15e7f2e27365c4
