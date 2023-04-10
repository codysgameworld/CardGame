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
public class Card {
    private Suit suit;
    private Rank rank;
    
    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Card(Card card) {
        this.suit = card.getSuit();
        this.rank = card.getRank();
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }
    
    
    public int getValueOfRank() {
        return rank.getValueOfRank();
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    //for test
    public boolean equals(Object obj) {
        if (obj instanceof Card) {
            Card other = (Card) obj;
            return this.rank == other.rank && this.suit == other.suit;
        }
        return false;
    }
}
    




