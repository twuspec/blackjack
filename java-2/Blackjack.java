public class Blackjack {

  public static void main(String[] args) {

    int money;          // Amount of money the user has.
    int bet;            // Amount user bets on a game.
    boolean userWins;   // Did the user win the game?

    TextIO.putln("Welcome to the game of blackjack.");
    TextIO.putln();

    money = 100;  // User starts with $100.

    while (true) {
      TextIO.putln("You have " + money + " dollars.");
      do {
        TextIO.putln("How many dollars do you want to bet?  (Enter 0 to end.)");
        TextIO.put("? ");
        bet = TextIO.getlnInt();
        if (bet < 0 || bet > money)
          TextIO.putln("Your answer must be between 0 and " + money + '.');
      } while (bet < 0 || bet > money);
      if (bet == 0)
        break;
      System.out.println("goint go");
      userWins = playBlackjack();
      if (userWins)
        money = money + bet;
      else
        money = money - bet;
      TextIO.putln();
      if (money == 0) {
        TextIO.putln("Looks like you've are out of money!");
        break;
      }
    }

    TextIO.putln();
    TextIO.putln("You leave with $" + money + '.');

  } // end main()


  static boolean playBlackjack() {
    // Let the user play one game of Blackjack.
    // Return true if the user wins, false if the user loses.

    Deck deck;                  // A deck of cards.  A new deck for each game.
    BlackjackHand dealerHand;   // The dealer's hand.
    BlackjackHand userHand;     // The user's hand.

    deck = new Deck();
    deck.createFullDeck();
    deck.toString();
    dealerHand = new BlackjackHand();
    userHand = new BlackjackHand();

    return true;

  }  // end playBlackjack()

} // end class Blackjack
