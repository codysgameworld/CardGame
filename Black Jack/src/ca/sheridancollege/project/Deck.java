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
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Deck {
    List<Card> deck;
    
    public List<Card> createDeck() {
        deck = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                deck.add(card);
            }
        }
        return deck;
    }
    public void shuffleDeck(){
        Collections.shuffle(deck, new Random());
    }

    public Card drawCard() { //take a card from the deck and put it to hand
        if(deck.size() <= 0) {
            System.out.println("There is no more cards in the deck");;
        }
        Card cardToTake = new Card(deck.get(0));
        deck.remove(0);
        return cardToTake;
    }

    @Override
    public String toString(){
        String output = "";

        for(Card card: deck){
            output += card;
            output += "\n";
        }
        return output;
    }

}

