package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class RankTest {
    
    public RankTest() {
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
     * Test of getValueOfRank method, of class Rank.
     */
    @Test
    public void testGetValueOfRank() {
        assertEquals(11, Rank.ACE.getValueOfRank());
        assertEquals(2, Rank.TWO.getValueOfRank());
        assertEquals(3, Rank.THREE.getValueOfRank());
        assertEquals(4, Rank.FOUR.getValueOfRank());
        assertEquals(5, Rank.FIVE.getValueOfRank());
        assertEquals(6, Rank.SIX.getValueOfRank());
        assertEquals(7, Rank.SEVEN.getValueOfRank());
        assertEquals(8, Rank.EIGHT.getValueOfRank());
        assertEquals(9, Rank.NINE.getValueOfRank());
        assertEquals(10, Rank.TEN.getValueOfRank());
        assertEquals(10, Rank.JACK.getValueOfRank());
        assertEquals(10, Rank.QUEEN.getValueOfRank());
        assertEquals(10, Rank.KING.getValueOfRank());
    }
    
    @Test
    public void testGetValueOfRankGood() {
        System.out.println("getValueOfRank Good Test");
        Rank instance = Rank.JACK;
        int expResult = 10;
        int result = instance.getValueOfRank();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetValueOfRankBad() {
        System.out.println("getValueOfRank Bad Test");
        Rank instance = Rank.JACK;
        int expResult = 3;
        int result = instance.getValueOfRank();
        assertNotEquals(expResult, result);
    }
    
    
    
}
