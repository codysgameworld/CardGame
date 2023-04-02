/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sarah
 */
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
    public void testGetValueOfRankBoundary() {
        System.out.println("getValueOfRank Boundary Test");
        Rank instance = null;
        int expResult = 0;
        int result = instance.getValueOfRank();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetValueOfRankGood() {
        System.out.println("getValueOfRank Good Test");
        Rank instance = Rank.JACK;
        int expResult = 10;
        int result = instance.getValueOfRank();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetValueOfRankBad() {
        System.out.println("getValueOfRank Bad Test");
        Rank instance = Rank.JACK;
        int expResult = 3;
        int result = instance.getValueOfRank();
        assertNotEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
    
    
}
