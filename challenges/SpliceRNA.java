import java.util.Scanner;
import java.util.regex.*;

public class SpliceRNA{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //scan.nextLine();
    System.out.print("Enter strand: ");
    String input = scan.nextLine();
    if(input.length()==0){
      System.out.println("No strand provided.");
      return;
    }else{
      try{
        String [] splitArray = input.split("\\s+");
        System.out.print("\nOutput is");
        for(int i =0;i<splitArray.length;i++){
          System.out.print(" "+spliced(splitArray[i]));
        }
        System.out.print("\n");
      }catch(PatternSyntaxException ex){
        return;
      }

    }
  }

  public static String spliced(String longString) {

    StringBuilder shortString = new StringBuilder(longString);

    String trimmedString = longString.replaceAll("GUGU(?:(?!AGAG).)*AGAG","");
    return(trimmedString);
      //regexChecker("GUGU[^(AGAG)]*AGAG",strangeString);
  }


}
