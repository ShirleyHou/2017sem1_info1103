import java.util.Scanner;


public class Triforce{
  public static void printTriangle(int sides){
    int rows = sides*2;//4
    int cols = 2*rows;//8
    //0-- 4
    for(int i=0;i<rows;i++){
      //0-8
      for (int j = 0;j<cols;j++){
        if (j == (rows-i-1) || (i>=sides && j==cols-i-1)){
          System.out.print('/');
        }else if(j == (rows+i)|| (i>=sides && j==i)){
          System.out.print('\\');
        }else if(i == rows-1||i== sides-1 && j>=sides &&j<(cols-sides)){
          System.out.print('_');
        }else{
          if(j<rows+i||(i>= sides && j<i)){
          System.out.print(' ');
          }
        }
      }
      System.out.print('\n');
    }
  }


  public static void main(String[] args) {
    System.out.print("Enter height: ");
    Scanner scan = new Scanner(System.in);
    String input = scan.next();
    try{
      int num = Integer.parseInt(input);
      if (num<2 || num>20){
        System.out.println("Invalid height.");
        return;
      }
      printTriangle(num);


    }catch (NumberFormatException nfe){
      System.out.println("Invalid height");
      return;
    }

  }
}
