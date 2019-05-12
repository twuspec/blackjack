
/* 
   A subclass of the Hand class that represents a hand of cards
   in the game of Blackjack.  To the methods inherited form Hand,
   it adds the method getBlackjackHand(), which returns the value
   of the hand for the game of Blackjack. 
*/

public class BlackjackHand extends Hand {
 
    public int getBlackjackValue() {
           // Returns the value of this hand for the
           // game of Blackjack.

        int val;      // The value computed for the hand.
        boolean ace;  // This will be set to true if the
                      //   hand contains an ace.
        int cards;    // Number of cards in the hand.

        val = 0;
        ace = false;
        cards = getCardCount();
        return val;

    }  // end getBlackjackValue()

} // end class BlackjackHand