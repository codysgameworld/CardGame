package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class HandTest {
    
    public HandTest() {
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
     * Test of calculateValue method, of class Hand.
     */
    @Test
    public void testCalculateValueGood() {
        System.out.println("calculateValue Good Test");
        Hand instance = new Hand();
        ArrayList<Card> cardsToBuild = new ArrayList<>(); 
        Card kingCard = new Card(Suit.DIAMOND, Rank.KING);
        cardsToBuild.add(kingCard);
        instance.buildTestHand(cardsToBuild);
        int expResult = 10;
        int result = instance.calculateValue();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCalculateValueBad() {
        System.out.println("calculateValue Bad Test");
        Hand instance = new Hand();
        ArrayList<Card> cardsToBuild = new ArrayList<>(); 
        Card kingCard = new Card(Suit.DIAMOND, Rank.KING);
        cardsToBuild.add(kingCard);
        instance.buildTestHand(cardsToBuild);
        int expResult = 3;
        int result = instance.calculateValue();
        assertNotEquals(expResult, result);
    }
    
    @Test
    public void testCalculateValueBoundary() {
        System.out.println("calculateValue Boundary Test");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.calculateValue();
        assertEquals(expResult, result);
    }
    
    
    
}
