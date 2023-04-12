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
import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> hand;

    public Hand() {
        hand = new ArrayList<>();
    }
    
    
    public void takeCardFromDeck(Deck deck) {
        hand.add(deck.drawCard());
    }
    
    public Card getCard(int idx){
        return hand.get(idx);
    }
    
    public int calculateValue() {
        int value = 0;
        int countAce = 0;
        for(Card card: hand) {
            value += card.getValueOfRank();
            if(card.getValueOfRank()==11) {
                countAce ++;
            }
        }
        if(value > 21 && countAce > 0) {
            while(countAce > 0 && value > 21) {
                countAce--;
                value-= 10;
            }
        }
        return value;
    }
    @Override
    public String toString(){
        String output = "";
        for(Card card: hand){
            output += card + "\n";
        }
        return output;
    }
    
    //for testing purposes
      public void buildTestHand(ArrayList<Card> cardsToBuild){
        this.hand = cardsToBuild;
    }
  
}