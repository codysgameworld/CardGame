package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DeckTest {
    
    public DeckTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createDeck method, of class Deck.
     */
    @Test
    public void testCreateDeck() {
        System.out.println("createDeck");
        Deck instance = new Deck();
        int expResult = 52;
        int result = instance.createDeck().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of shuffleDeck method, of class Deck.
     */
    @Test
    public void testShuffleDeck() {
        System.out.println("shuffleDeck");
        Deck instance = new Deck();
        instance.createDeck();
        List<Card> originalDeck = new ArrayList<>(instance.deck);
        instance.shuffleDeck();
        assertNotEquals(originalDeck, instance.deck);
    }

    /**
     * Test of drawCard method, of class Deck.
     */
    @Test
    public void testDrawCard() {
        System.out.println("drawCard");
        Deck instance = new Deck();
        instance.createDeck();
        Card expResult = instance.deck.get(0);
        Card result = instance.drawCard();
        assertEquals(expResult, result);
    }

}
