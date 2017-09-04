import java.util.ArrayList;
public class CardPlayer{
  public String name;
  public ArrayList<String> cards = new ArrayList<String>();
  public CardPlayer(String setname){
    this.name = setname;
  }
  public void pickupCard(String cardName){
    this.cards.add(cardName);
  }
  public void placeCard (String cardName){
    this.cards.remove(cardName);
  }
  public void showCards(){
    for (String i : cards){
      System.out.println(i);
    }
  }
}
