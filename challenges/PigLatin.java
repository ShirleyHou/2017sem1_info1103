import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class PigLatin{
  public static boolean isVowel(char a){
    boolean result = false;
    if (a=='a'||a =='e'||a=='i'||a=='o'||a =='u'||a == 'y'){
      result = true;
    }
    return result;
  }
  public static String changeCon(String toChange){
    int endIndex = 0;
    while(!isVowel(toChange.charAt(endIndex))){
      endIndex++;
    }
    String toReturn = toChange.substring(endIndex)+toChange.substring(0,endIndex)+"ay";
    return toReturn;
  }
  public static String changeVol(String toChange){
    String appendWay;
    if(toChange.charAt(toChange.length()-1)=='w'){
      appendWay = toChange+"ay";
    }else{
      appendWay = toChange+"way";
    }
    return appendWay;
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<String> store =new ArrayList<String>();
    while(scan.hasNextLine()){
      String line = scan.nextLine();
      store.add(line);
    }
    String [] toChange = store.toArray(new String[store.size()]);
    for(int i = 0;i<toChange.length;i++){
      String [] toPrint = toChange[i].split(" ");
      for (int j = 0;j<toPrint.length;j++){
        if(toPrint[j].equals("")){
          toPrint[j]="";
        }else if(isVowel(toPrint[j].charAt(0))){
          toPrint[j]= changeVol(toPrint[j]);
        }else if(!isVowel(toPrint[j].charAt(0))){
          toPrint[j]= changeCon(toPrint[j]);
        }else{

          toPrint[j]=toPrint[j];

        }
      }
      for (int j=0;j<toPrint.length;j++){
        if(j==toPrint.length-1){
          System.out.print(toPrint[j]);
        }else{
        System.out.print(toPrint[j]+" ");
        }
      }
      System.out.print("\n");
    }
  }
}
