import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class checkCalcudoku{
  static int rows = 6;
  static int cols = 6;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter questionBoard");
    int [][] questionBoard = getQuestionBoard();
    String lastLine = scan.nextLine();
    String [] instruction = lastLine.split(" ");
    System.out.println("please enter answer board");
    int [][] answerBoard = getAnswerBoard();
    System.out.println("Get answerBoard completed, checking.");
    int i = 0;
    boolean result = true;
    while (i<instruction.length){
      result = checkAnswerBoard(i, instruction, questionBoard, answerBoard);
      System.out.print(result+" ");
      i++;
    }
    System.out.println("The final result is:"+ result);
  }
  public static int [][] getQuestionBoard(){
    int [][] questionBoard = new int [rows][cols];
    int countRows = 0;
    Scanner scan = new Scanner(System.in);
    while(countRows<6){
      String currentrow = scan.nextLine();
      String [] split = currentrow.split(" ");
      try{

        for (int i = 0;i<split.length;i++){
          int a = Integer.parseInt(split[i]);
          questionBoard[countRows][i] = a;
        }
      }catch(NumberFormatException nfe){
        System.out.println("non integer encountered");
      }
      countRows++;
    }
    return questionBoard;
  }
  public static int [][] getAnswerBoard(){
    int [][] answerBoard = new int [rows][cols];
    Scanner scan = new Scanner(System.in);
    int countRows = 0;
    while(countRows<6){
      String currentrow = scan.nextLine();
      String [] split = currentrow.split(" ");
      try{
        for (int i = 0;i<split.length;i++){
          int a = Integer.parseInt(split[i]);
          answerBoard[countRows][i] = a;
        }
      }catch(NumberFormatException nfe){
        System.out.println("non integer encountered");
      }
      countRows++;
    }
    return answerBoard;
  }
  public static boolean checkAnswerBoard(int list, String [] instruction, int [][] questionBoard, int [][] answerBoard){
    //need something to return
    boolean result = false;
    String operation = instruction[list];
    if(operation.charAt(operation.length()-1)=='+'){
      result = checkAdd(list, instruction, questionBoard, answerBoard);
    }else if(operation.charAt(operation.length()-1)=='-'){
      result = checkSub(list, instruction,questionBoard, answerBoard);
    }else if(operation.charAt(operation.length()-1)=='*'){
      result = checkPro(list,instruction,questionBoard, answerBoard);
    }else if(operation.charAt(operation.length()-1)=='/'){
      result = checkDiv(list,instruction,questionBoard, answerBoard);
    }else{
      result = checkIs(list,instruction,questionBoard, answerBoard);
    }
    return result;
  }
  public static boolean checkAdd(int list, String [] instruction, int [][] questionBoard, int [][] answerBoard){
    int sum = 0;
    String findTarget = instruction[list];
    String integerPart = findTarget.substring(0,findTarget.length()-1);
    int target = Integer.parseInt(integerPart);
    for(int i=0;i<rows;i++){
      for(int j= 0;j<cols;j++){
        if(questionBoard[i][j]==list){
          sum = sum+answerBoard[i][j];
        }
      }
    }
    if(sum ==target){
      return true;
    }else{
      return false;
    }
  }
  public static boolean checkSub(int list,String [] instruction,int [][] questionBoard, int [][] answerBoard){
    int sub = 0;
    int [] toSub = new int[2];
    int sequence =0;
    String findTarget = instruction[list];
    String integerPart = findTarget.substring(0,findTarget.length()-1);
    int target = Integer.parseInt(integerPart);
    for(int i=0;i<rows;i++){
      for(int j= 0;j<cols;j++){
        if(questionBoard[i][j]==list){
          toSub[sequence] = answerBoard[i][j];
          sequence++;
        }
      }
    }
    if(toSub[0]>toSub[1]){
      sub = toSub[0]-toSub[1];
    }else{
      sub = toSub[1]-toSub[0];
    }
    if(sub ==target){
      return true;
    }else{
      return false;
    }
  }
  public static boolean checkPro(int list,String [] instruction,int [][] questionBoard, int [][] answerBoard){
    int pro = 1;
    String findTarget = instruction[list];
    String integerPart = findTarget.substring(0,findTarget.length()-1);
    int target = Integer.parseInt(integerPart);
    for(int i=0;i<rows;i++){
      for(int j= 0;j<cols;j++){
        if(questionBoard[i][j]==list){
          pro = pro*answerBoard[i][j];
        }
      }
    }
    if(pro ==target){
      return true;
    }else{
      return false;
    }
  }
  public static boolean checkDiv(int list,String [] instruction,int [][] questionBoard, int [][] answerBoard){
    int div = 1;
    int [] toDiv = new int[2];
    int sequence =0;
    String findTarget = instruction[list];
    String integerPart = findTarget.substring(0,findTarget.length()-1);
    int target = Integer.parseInt(integerPart);
    for(int i=0;i<rows;i++){
      for(int j= 0;j<cols;j++){
        if(questionBoard[i][j]==list){
          toDiv[sequence] = answerBoard[i][j];
          sequence++;
        }
      }
    }
    if(toDiv[0]>toDiv[1]){
      div = toDiv[0]/toDiv[1];
    }else{
      div = toDiv[1]/toDiv[0];
    }
    if(div ==target){
      return true;
    }else{
      return false;
    }
  }
  public static boolean checkIs(int list,String [] instruction,int [][] questionBoard, int [][] answerBoard){
    String findTarget = instruction[list];
    boolean result = false;
    int target = Integer.parseInt(findTarget);
    for(int i=0;i<rows;i++){
      for(int j= 0;j<cols;j++){
        if(questionBoard[i][j]==list){
          if(answerBoard[i][j]==target){
            result =  true;
          }
        }
      }
    }
    return result;
  }
}
