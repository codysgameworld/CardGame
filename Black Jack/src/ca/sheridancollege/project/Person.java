/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author yeli March 2023
 * @author Cody Labelle
 * @author Sarah McCrie
 */
public abstract class Person {

    private Hand hand;
    private String name;
    
    public Person() {
        this.hand = new Hand();
        this.name = "";
    }

    public Hand getHand() {
        return hand;
    }
    public void setHand(Hand hand) {
        this.hand = hand;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void showHand(){
        System.out.println(name + "'s hand:\n" + hand + "Valued at: " + hand.calculateValue());
    }
    
    public void hit(Deck deck){
        this.hand.takeCardFromDeck(deck);
        System.out.println(name + " gets a card");
        showHand();
    }

    public boolean hasBlackjack(){
        if(this.getHand().calculateValue() == 21){
            return true;
        }
        else{
            return false;
        }
    }
}
