package ca.sheridancollege.project;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    
    public PersonTest() {
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
     * Test of hit method, of class Person.
     */
    @Test
    public void testHitGood() {
        System.out.println("hit Good Test");
        Deck deck = new Deck();
        deck.createDeck();
        Person instance = new PersonImpl();
        instance.hit(deck);
    }

    /**
     * Test of hasBlackjack method, of class Person.
     */
    @Test
    public void testHasBlackjackGood() {
        System.out.println("hasBlackjack Good Test");
        Person instance = new PersonImpl();
        ArrayList<Card> cardsToBuild = new ArrayList<>(); 
        Card aceCard = new Card(Suit.CLUB, Rank.ACE);
        Card kingCard = new Card(Suit.DIAMOND, Rank.KING);
        cardsToBuild.add(aceCard);
        cardsToBuild.add(kingCard);
        Hand testHand = new Hand();
        testHand.buildTestHand(cardsToBuild);
        instance.setHand(testHand);
        boolean expResult = true;
        boolean result = instance.hasBlackjack();
        assertEquals(expResult, result);
    }

        @Test
    public void testHasBlackjackBad() {
        System.out.println("hasBlackjack Bad Test");
        Person instance = new PersonImpl();
        ArrayList<Card> cardsToBuild = new ArrayList<>(); 
        Card twoCard = new Card(Suit.CLUB, Rank.TWO);
        Card kingCard = new Card(Suit.DIAMOND, Rank.KING);
        cardsToBuild.add(twoCard);
        cardsToBuild.add(kingCard);
        Hand testHand = new Hand();
        testHand.buildTestHand(cardsToBuild);
        instance.setHand(testHand);
        boolean expResult = false;
        boolean result = instance.hasBlackjack();
        assertEquals(expResult, result);
    }
    
        @Test
    public void testHasBlackjackBoundary() {
        System.out.println("hasBlackjack Boundary Test");
        Person instance = new PersonImpl();
        ArrayList<Card> cardsToBuild = new ArrayList<>();
        Hand testHand = new Hand();
        testHand.buildTestHand(cardsToBuild);
        instance.setHand(testHand);
        boolean expResult = false;
        boolean result = instance.hasBlackjack();
        assertEquals(expResult, result);
    }
    
    public class PersonImpl extends Person {
    }
    
}
