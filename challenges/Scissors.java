import java.io.*;
import java.io.IOException;
import java.util.Scanner;
public class Scissors{
  public static void main(String[] args) {
    try{
      if(args.length<2){
        System.out.println("Not enough arguments");
        return;
      }
      int col = Integer.parseInt(args[0]);
      String fileName = args[1];
      File text = new File(fileName);
      Scanner scan = new Scanner(text);
      while (scan.hasNextLine()){
        String sentence = scan.nextLine();
        if(sentence.length()>0){
          String [] words = sentence.split(" ");
          if(col>=words.length){
            continue;
          }else{
            System.out.println(words[col-1]);
          }
        }else{
          //String [] sentence = scan.nextLine().split();
          continue;
        }
      }
    }catch(IllegalArgumentException iae){
      System.out.println("please enter correct column and file name.");

    }catch(FileNotFoundException fnf){
      System.out.println("File Not Found");
    }

  }
}
