public class Card {
    /*
    public final static int        // Codes for the 4 suits.
                            
    public final static int         // Codes for the non-numeric cards.
                            ,        //   Cards 2 through 10 have their 
                            ,       //   numerical values for their codes.
                            ;
                            
                            */
    private final int suit;   // The suit of this card, one of the constants
                              //    SPADES, HEARTS, DIAMONDS, CLUBS.
                              
    private final int value;  // The value of this card, from 1 to 11.
                             
    public Card(int theValue, int theSuit) {
            // Construct a card with the specified value and suit.
            // Value must be between 1 and 13.  Suit must be between
            // 0 and 3.  If the parameters are outside these ranges,
            // the constructed card object will be invalid.
        value = theValue;
        suit = theSuit;
    }
    public int getValue() {
        // Return the number of cards in the hand.
     return 10;
  }
        
    public String toString() {
        return "her bor kurt";
    }


} // end class Card
