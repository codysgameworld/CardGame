/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author yeli8
 */
import java.util.ArrayList;

public class Hand extends Card {
    private ArrayList<Card> hand;
    
    public Hand(Suit suit, Rank rank) {
        super(suit, rank);
    }
    public void takeCardFromDeck(Deck deck){

    }
    public void adjustAceValue(){

    }
    @Override
    public String toString(){
        String output = "";
        for(Card card: hand){
            output += card + "/n";
        }
        return output;
    }
}