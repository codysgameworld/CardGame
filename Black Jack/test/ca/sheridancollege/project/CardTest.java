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
    public void testGetSuitGood() {
        System.out.println("GetSuit Good Test");
        Card card = new Card(Suit.CLUB, Rank.ACE);
        assertEquals(Suit.CLUB, card.getSuit());
    }

    @Test
    public void testGetSuitBad() {
        System.out.println("GetSuit Bad Test");
        Card card = new Card(Suit.CLUB, Rank.ACE);
        assertNotEquals(Suit.SPADE, card.getSuit());
    }

    @Test
    public void testGetRankGood() {
        System.out.println("GetRank Good Test");
        Card card = new Card(Suit.HEART, Rank.KING);
        assertEquals(Rank.KING, card.getRank());
    }

    @Test
    public void testGetRankBad() {
        System.out.println("GetRank Bad Test");
        Card card = new Card(Suit.HEART, Rank.KING);
        assertNotEquals(Rank.QUEEN, card.getRank());
    }

    @Test
    public void testGetValueOfRankGood() {
        System.out.println("GetValueOfRank Good Test");
        Card card = new Card(Suit.SPADE, Rank.JACK);
        assertEquals(10, card.getValueOfRank());
    }

    @Test
    public void testGetValueOfRankBad() {
        System.out.println("GetValueOfRank Bad Test");
        Card card = new Card(Suit.SPADE, Rank.JACK);
        assertNotEquals(11, card.getValueOfRank());
    }

    @Test
    public void testToStringGood() {
        System.out.println("ToString Good Test");
        Card card = new Card(Suit.DIAMOND, Rank.TWO);
        assertEquals("TWO of DIAMOND", card.toString());
    }

    @Test
    public void testToStringBad() {
        System.out.println("ToString Bad Test");
        Card card = new Card(Suit.DIAMOND, Rank.TWO);
        assertNotEquals("TWO of CLUB", card.toString());
    }

}

