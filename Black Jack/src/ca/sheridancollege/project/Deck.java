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
public class Deck extends Card {
    private ArrayList<Card> deck;
    
    public Deck(Suit suit, Rank rank) {
        super(suit, rank);
    }
    public void createDeck(){
        this.deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                this.deck.add(new Card(suit, rank));
            }
        }
    }
    public void shuffleDeck(){

    }
    public Card draw(){ //take a card from the deck and put it to hand
       return deck.remove(0);
    }
    public int remainingCards(){
        return deck.size();
  }
}

