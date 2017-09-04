import java.util.Scanner;
import java.lang.*;
import java.util.Arrays;

public class Calcudoku{
  private int [][] solutionBoard;
  private int [][] questionBoard;
  //private static int [][] questionBoard;
  private static int rows = 6;
  private static int cols = 6;
  private boolean foundSolution;
  private String [] instruction;

  public Calcudoku(int[][] questionBoard, int[][]solutionBoard, String[] instruciton){
    this.questionBoard = questionBoard;
    this.solutionBoard = solutionBoard;
    this.instruction = instruction;
    this.foundSolution = false;
  }

  public static void main(String[] args) {
    //scan in questionBoard
    int [][] emptyBoard = new int[rows][cols];
    int [][] questionBoard = new int [rows][cols];
    Scanner scan = new Scanner(System.in);
    int countRows = 0;
    while(countRows<6){
      String currentrow = scan.nextLine();
      String [] split = currentrow.split(" ");
      try{
        for (int i = 0;i<split.length;i++){
          int a =Integer.parseInt(split[i]);
          questionBoard[countRows][i] = a;
        }
      }catch(NumberFormatException nfe){
        System.out.println("non integer encountered");
      }
      countRows++;
    }
    //questionBoard completed;


    //set instruction line
    String lastLine = scan.nextLine();
    String [] instruction = lastLine.split(" ");
    //instruction line completed;

    //give all solution board with 0;
    for(int i = 0;i<rows;i++){
      for(int j = 0;j<cols;j++){
        emptyBoard[i][j]=0;
      }
    }
    //initialize answerBoard completed;

    //initialize current Calcudoku!!
    Calcudoku solution = new Calcudoku(questionBoard,emptyBoard,instruction);
    solution.backTrace(0,0);
  }
  //this continues the calculation process.
  private void backTrace(int i, int j){
    if(i ==5&&j==6){
      //successfully completed current trial
      System.out.println("Completed");
      printArray();
      return;
    }

      //switch to newLine.
      if(j >=6){
        i++;
        j=0;
      }
      if(this.solutionBoard[i][j]==0){
        for(int k =1;k<=6;k++){
          if(this.check(i,j,k)){
            this.solutionBoard[i][j]=k;
            //确定填好了这个格子
            int list = this.questionBoard[i][j];
            backTrace(i,j+1);//填下一个格子
            this.solutionBoard[i][j]=0;

          }
        }
      }else{
        backTrace(i,j+1);
      }
    }
    //whether legal to give value into a empty cell.
    //检查模块
    private boolean check(int row, int line, int number){
      for(int i = 0;i<6;i++){
        if(this.solutionBoard[row][i]==number||this.solutionBoard[i][line]==number){
          return false;
        }
      }
      int list = this.questionBoard[row][line];
      int count = 0;
      System.out.println(list);
      this.checkAnswerBoard(list);
      if(this.checkAnswerBoard(list)){
        return true;
      }else{
        return false;
      }

    }
    private boolean checkAnswerBoard(int list){
      //need something to return
      boolean result = false;
      String operation = this.instruction[list];
      if(operation.charAt(operation.length()-1)=='+'){
        result = checkAdd(list);
      }else if(operation.charAt(operation.length()-1)=='-'){
        result = checkSub(list);
      }else if(operation.charAt(operation.length()-1)=='*'){
        result = checkPro(list);
      }else if(operation.charAt(operation.length()-1)=='/'){
        result = checkDiv(list);
      }else{
        result = checkIs(list);
      }
      return result;
    }
    public boolean checkAdd(int list){
      int sum = 0;
      String findTarget = this.instruction[list];
      String integerPart = findTarget.substring(0,findTarget.length()-1);
      int target = Integer.parseInt(integerPart);
      for(int i=0;i<rows;i++){
        for(int j= 0;j<cols;j++){
          if(this.questionBoard[i][j]==list){
            sum = sum+this.solutionBoard[i][j];
          }
        }
      }
      if(sum ==target){
        return true;
      }else{
        return false;
      }
    }
    public boolean checkSub(int list){
      int sub = 0;
      int [] toSub = new int[2];
      int sequence =0;
      String findTarget = this.instruction[list];
      String integerPart = findTarget.substring(0,findTarget.length()-1);
      int target = Integer.parseInt(integerPart);
      for(int i=0;i<rows;i++){
        for(int j= 0;j<cols;j++){
          if(this.questionBoard[i][j]==list){
            toSub[sequence] = this.solutionBoard[i][j];
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
    public boolean checkPro(int list){
      int pro = 1;
      String findTarget = this.instruction[list];
      String integerPart = findTarget.substring(0,findTarget.length()-1);
      int target = Integer.parseInt(integerPart);
      for(int i=0;i<rows;i++){
        for(int j= 0;j<cols;j++){
          if(this.questionBoard[i][j]==list){
            pro = pro*this.solutionBoard[i][j];
          }
        }
      }
      if(pro ==target){
        return true;
      }else{
        return false;
      }
    }
    public boolean checkDiv(int list){
      int div = 1;
      int [] toDiv = new int[2];
      int sequence =0;
      String findTarget = this.instruction[list];
      String integerPart = findTarget.substring(0,findTarget.length()-1);
      int target = Integer.parseInt(integerPart);
      for(int i=0;i<rows;i++){
        for(int j= 0;j<cols;j++){
          if(this.questionBoard[i][j]==list){
            toDiv[sequence] = this.solutionBoard[i][j];
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
    public boolean checkIs(int list){
      String findTarget = this.instruction[list];
      boolean result = false;
      int target = Integer.parseInt(findTarget);
      for(int i=0;i<rows;i++){
        for(int j= 0;j<cols;j++){
          if(this.questionBoard[i][j]==list){
            if(this.solutionBoard[i][j]==target){
              result =  true;
            }
          }
        }
      }
      return result;
    }
    public void printArray(){
      for(int i = 0;i<6;i++){
        for(int j=0;j<6;j++){
          System.out.print(this.solutionBoard[i][j]+" ");
        }
        System.out.println();
      }
      System.out.println();
      foundSolution = true;
    }
}
