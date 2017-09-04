import java.util.Scanner;
import java.util.*;

public class GoldenRatio{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter two numbers: ");
    try{
      double a = scan.nextDouble();
      double b = scan.nextDouble();
      if(isGR(a,b)){
        System.out.println("\nGolden ratio!");
      }else{
        System.out.println("\nMaybe next time.");
      }

    }catch(NumberFormatException nfe){ //usually the error for parseInt, parseDouble, etc.
      //this Excpetion belongs to java.util.*
      System.out.println("\nInvalid input.");
      return;
    }catch(InputMismatchException ime){//userlly when you scans something not correct.
      //this exception belongs to java.lang.*
      System.out.println("\nInvalid input");
      return;
    }

  }
  public static boolean isGR(double a, double b){
    boolean result = false;
    double divided = 0;
    double divider = 0;
    if(a>=b){
      divided = a;
      divider =b;
    }else{
      divided = b;
      divider = a;
    }
    double ratio = divided/divider;
    double formatted = (double) Math.round(ratio*1000d)/1000d;
    if(formatted == 1.618){
      result = true;
    }else{
      result = false;
    }
    return result;
  }
}
