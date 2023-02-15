/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author yeli8
 */
public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValueOfRank(Rank rank) throws Exception{
        int value = 0;
        switch(rank){
            case TWO: value = 2;
            break;
            case THREE: value = 3;
            break;
            case FOUR: value = 4;
            break;
            case FIVE: value = 5;
            break;
            case SIX: value = 6;
            break;
            case SEVEN: value = 7;
            break;
            case EIGHT: value = 8;
            break;
            case NINE: value = 9;
            break;
            case TEN: 
            case JACK:
            case QUEEN: 
            case KING: value = 10;
            break;
            case ACE: value = 11;
            break;
            default: throw new Exception("Illegal rank!");
        }
        return value;
    }

    @Override
    public String toString() {
        try {
            return rank + " of " + suit + ", the value of the card: " + getValueOfRank(rank);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
    
}



