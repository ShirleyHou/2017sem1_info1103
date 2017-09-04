public class PokemonBattle{
  public static void main(String[] args) {
    int [] a = {1,2,3,4,5};
    for(int i:a){
      System.out.println(i);
    }





  }
  public static void activateMega(String pokemon){
    System.out.println(pokemon.hashCode());
    pokemon = "Mega"+pokemon;
    //System.out.println(pokemon.hashCode());
  }
}
