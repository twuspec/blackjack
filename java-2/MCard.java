public class MCard {

    private Suit suit;
    private Value value;
    
    public MCard(Suit suit, Value value) {

        this.value = value;
        this.suit = suit;
    }
    public Value getValue() {
        // Return the number of cards in the hand.
     return this.value;
  }
        
public String toString() {
        return this.suit.toString() + "-" + this.value.toString();
    }


} // end class Card
