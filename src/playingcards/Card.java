
package playingcards;


public class Card {
    private int suit;
    private int rank;
    
    /**
     * Creates a new Card
     * @param rank this is the int representation of the card's rank
     * @param suit this is the int representation of the card's suit
     */
    public Card(int rank, int suit) {
        this.suit = suit;
        this.rank = rank;
    }
    
    /**
     * Creates a new Card
     * @param cardno int representation of card where 0 = 2 of clubs, 13 is 2 of diamonds
     */
    public Card(int cardno) {
        this.rank = cardno % 13;
        this.suit = (cardno / 13) % 4;
    }
    
    /**
     * Get the rank of a card
     * @return rank of card as an integer
     */
    public int rank() { return rank; }
    
    /**
     * Return the card's suit
     * @return suit of the card as an integer
     */
    public  int suit() { return suit; }
    
    /**
     * Compare a card to this  card
     * @param c card comparing to this card
     * @return true if same suit, false if not.
     */
    public boolean sameSuit(Card c) {
        return (this.suit == c.suit);
    }
    
    /**
     * Compare this  card to another
     * @param c  Card to compare this to
     * @return true if same rank, false if not
     */
    public  boolean sameRank(Card c) {
        return (this.rank == c.rank);
    }
    
    /**
     * Compare card to this  card to see if they area the same
     * @param c card to compare to this card
     * @return true if rank and suit match, false if either is a mismatch
     */
    public boolean sameCard(Card c) {
        return (this.sameRank(c) && this.sameSuit(c));
    }
    
    /**
     * Return the difference in the ranks of this card and another
     * @param c  Card to diff from this card

* @return rank difference
     */
    public int rankDiff(Card c) {
        return (this.rank - c.rank);
    }
    
    /**
     * Converts a card to a string
     * @return 
     */
    @Override
     public String toString () {
        String ranks = "23456789TJQKA";
        String suits = "\u2663\u2666\u2665\u2660";
        return ranks.charAt(rank) + "" + suits.charAt(suit);
    }
}
