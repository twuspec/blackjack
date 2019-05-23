import java.util.Vector;

public class Hand {

   private Vector hand;   // The cards in the hand.
   
   public Hand() {
           // Create a Hand object that is initially empty.
      hand = new Vector();
   }
   
   public void addCard(MCard c) {

   }
   
   public void removeCard(MCard c) {

   }

   public int getCardCount() {
      return 10;

   }
   
   public void removeCard(int position) {

   }
   
   
   public MCard getCard(int position) {

      MCard myCard = new MCard(Suit.values()[1],Value.values()[1]);
      return myCard;

   }
   
   public void sortBySuit() {

   }
   
   public void sortByValue() {

   }
   
}
