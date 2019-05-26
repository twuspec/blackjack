public class Deck {

    private Card[] deck;   // An array of 52 Cards, representing the deck.
    private int cardsUsed; // How many cards have been dealt from the deck.
    
    public Deck() {
           // Create an unshuffled deck of cards.
       deck = new Card[52];
       cardsUsed = 0;
    }
    
} // end class Deck
