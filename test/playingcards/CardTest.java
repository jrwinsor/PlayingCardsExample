/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playingcards;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jim
 */
public class CardTest {
    
    public CardTest() {
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
     * Test of rank method, of class Card.
     */
    @Test
    public void testRank() {
        System.out.println("rank");
        Card instance = new Card(Ranks.QUEEN,Suits.HEARTS);
        int expResult = Ranks.QUEEN;
        int result = instance.rank();
        assertEquals(expResult, result);

    }

    /**
     * Test of suit method, of class Card.
     */
    @Test
    public void testSuit() {
        System.out.println("suit");
        Card instance = new Card(Ranks.ACE,Suits.DIAMONDS);
        int expResult = Suits.DIAMONDS;
        int result = instance.suit();
        assertEquals(expResult, result);
    }

    /**
     * Test of sameSuit method, of class Card.
     */
    @Test
    public void testSameSuit() {
        System.out.println("sameSuit");
        Card c = new Card(Ranks.JACK,Suits.HEARTS);
        Card instance = new Card(Ranks.FOUR, Suits.HEARTS);
        Card instance2 = new Card(Ranks.THREE, Suits.SPADES);
        boolean expResult = true;
        boolean result = instance.sameSuit(c);
        boolean expResult2 = false;
        boolean result2 = instance2.sameSuit(c);
        assertEquals(expResult, result);
        assertEquals(expResult2,result2);

    }

    /**
     * Test of sameRank method, of class Card.
     */
    @Test
    public void testSameRank() {
        System.out.println("sameRank");
        Card c = new Card(Ranks.TWO, Suits.HEARTS);
        Card instance = new Card(Ranks.TWO, Suits.SPADES);
        Card instance2 = new Card(Ranks.THREE, Suits.HEARTS);
        boolean expResult = true;
        boolean result = instance.sameRank(c);
        boolean expResult2 = false;
        boolean result2 = instance2.sameRank(c);
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of sameCard method, of class Card.
     */
    @Test
    public void testSameCard() {
        System.out.println("sameCard");
        Card c = new Card(Ranks.FIVE,Suits.DIAMONDS);
        Card instance = new Card(Ranks.FOUR,Suits.DIAMONDS);
        Card instance2 = new Card(Ranks.FIVE,Suits.DIAMONDS);
        boolean expResult = false;
        boolean result = instance.sameCard(c);
        boolean expResult2 = true;
        boolean result2 = instance2.sameCard(c);
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of rankDiff method, of class Card.
     */
    @Test
    public void testRankDiff() {
        System.out.println("rankDiff");
        Card c = new Card(Ranks.FOUR, Suits.CLUBS);
        Card instance = new Card(Ranks.FOUR, Suits.DIAMONDS);
        int expResult = 0;
        int result = instance.rankDiff(c);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Card.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Card instance = new Card(Ranks.TEN, Suits.HEARTS);
        String expResult = "T" + "\u2665";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
}
