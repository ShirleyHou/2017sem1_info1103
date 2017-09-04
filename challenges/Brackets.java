import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;
import java.util.ArrayList;
public class Brackets{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    while(scan.hasNextLine()){
      String brackets = scan.nextLine();
      int sum = 0;
      int i = 0;
      boolean balanced = true;
      Stack<Character> thisString= new Stack<>();
      ArrayList<Integer> countNumber = new ArrayList<Integer>();
      while (i <brackets.length() && balanced == true){
        if(brackets.charAt(i)=='('){
          thisString.push('(');
          sum=sum+1;
          countNumber.add(sum);
        }else{
          if (thisString.isEmpty()){
            balanced = false;
          }else{
            if(brackets.charAt(i)==')'){
              thisString.pop();
              sum = sum-1;
            }
          }
        }
        i++;
      }
      if(thisString.isEmpty()&& balanced== true){
        if(countNumber.isEmpty()){
          System.out.println("0");
        }else{
          int maxNumber = Collections.max(countNumber);
          System.out.println(maxNumber);
        }
      }else{
        System.out.println("Not balanced");
      }
    }

  }
}
