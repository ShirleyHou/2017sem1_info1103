import java.util.Scanner;
import java.util.InputMismatchException;

public class Caesar{
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter key: ");

    try{
      int key = scan.nextInt();
      if(key<0){
        System.out.println("\nInvalid key!");
        return;
      }
      scan.nextLine();
      System.out.print("Enter line: ");
      String line = scan.nextLine();

      String coded = "";
      int alphabetSize = 'z'-'a'+1;
      for (int i =0;i<line.length();i++){
        char letter = line.charAt(i);
        if(!Character.isLetter(letter)){
          coded += letter;
          continue;
        }

        char offset = 'A';
        if(Character.isLowerCase(letter)){
          offset = 'a';
        }
        letter = (char) (letter - offset);
        letter = (char) ((letter + key) % alphabetSize );
        letter = (char) (letter+offset);
        coded += letter;
      }
      System.out.println("\n"+coded);
    }catch (InputMismatchException IME){
      System.out.println("\nInvalid key!");
      return;
    }
  }

}
