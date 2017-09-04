import java.util.Scanner;
import java.util.*;

public class RomanNumerals {

  public static void main(String[] args) {
    try{
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = scan.nextInt();
      int [] numbers = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
      String [] digits = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
      String output = "";
      for (int n = numbers.length-1;n>=0;n--){
        while (num/numbers[n]>=1){
          output = output+digits[n];
          num = num-numbers[n];
        }
      }
      System.out.println("\nRoman equivalent is "+output);
    }catch(InputMismatchException ime){
      System.out.println("\nNot a number.");
      return;
    }
  }

}
