
package playingcardsrun;

import java.util.Random;
import playingcards.*;

public class PlayingCardsRun {

    public static void main(String[] args) {
        // TODO code application logic here
        Random gen = new Random();
        Card c = new Card(Ranks.ACE, Suits.SPADES);
        Card d = new Card(gen.nextInt(52));
        
        System.out.printf("Cards: %s %s\n",c,d);
        System.out.printf("Same Rank: %s\n",c.sameRank(d));
        System.out.printf("Same Suit: %s\n",c.sameSuit(d));
        System.out.printf("Same Card: %s\n",c.sameCard(d));
        
    }
    
}
