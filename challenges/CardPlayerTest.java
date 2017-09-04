public class CardPlayerTest{
  public static void main(String[] args) {
    CardPlayer player1 = new CardPlayer("Dora");
    player1.pickupCard("Spades King");
    player1.pickupCard("Spades 10");
    player1.pickupCard("Diamonds 3");
    player1.pickupCard("Diamonds Jack");
    player1.pickupCard("Clubs King");

    player1.placeCard("Clubs King");
    player1.placeCard("Spades King");
    player1.showCards();
  }

}
