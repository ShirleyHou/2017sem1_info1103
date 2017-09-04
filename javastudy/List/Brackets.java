import java.util.Scanner;

public class Brackets{

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while(scan.hasNextLine()){
      String brackets = scan.nextLine();
      int a = 0;
      int sum = 0;
      for(int i =0;i<brackets.length();i++){
        if(brackets.charAt(i)=='('){
          a++;
          sum++;
          if(brackets.charAt(i+1)==')'){
            sum--;
          }
        }else if(brackets.charAt(i)==')'){
          a--;
        }
      }
      if(a!=0){
        System.out.println("\n"+sum);
      }
      if(a!=0){
        System.out.println("\nNot balanced");
      }
    }

  }
}
