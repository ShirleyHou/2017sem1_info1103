import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class scanNumbers{
  public static void main(String[] args) {
    System.out.println("Please input number");
    List<Integer> a = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    String ints = scan.nextLine();
    String [] intSplit = ints.split(" ");
    int arrayLength = intSplit.length;
    int [] arrayUse = new int [arrayLength];
    for (int i=0;i<intSplit.length;i++){
      arrayUse[i]=Integer.parseInt(intSplit[i]);
    }
    System.out.println(Arrays.toString(arrayUse));
  }
}
