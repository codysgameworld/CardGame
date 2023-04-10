package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {
    
    @Test
    public void testGetSuit() {
        Card card = new Card(Suit.CLUB, Rank.ACE);
        assertEquals(Suit.CLUB, card.getSuit());
    }
    
    @Test
    public void testGetRank() {
        Card card = new Card(Suit.HEART, Rank.KING);
        assertEquals(Rank.KING, card.getRank());
    }
    
    @Test
    public void testGetValueOfRank() {
        Card card = new Card(Suit.SPADE, Rank.JACK);
        assertEquals(10, card.getValueOfRank());
    }
    
    @Test
    public void testToString() {
        Card card = new Card(Suit.DIAMOND, Rank.TWO);
        assertEquals("TWO of DIAMOND", card.toString());
    }
    
    @Test
    public void testEquals() {
        Card card1 = new Card(Suit.CLUB, Rank.ACE);
        Card card2 = new Card(Suit.CLUB, Rank.ACE);
        assertTrue(card1.equals(card2));
        
        Card card3 = new Card(Suit.HEART, Rank.KING);
        assertFalse(card1.equals(card3));
    }
    
}
