import java.util.Scanner;
import java.util.Arrays;

public class Calkudaku{
  public int [][] solutionBoard; //store the answer board.
  public int [][] questionBoard; //store user input: question board.
  static int rows = 6; //maximum 6 rows.
  static int cols = 6; //maximum 6 columns.
  boolean foundSolution; //use for checking if the solution has been found.
  String [] instruction; //use to store the 7th user input line.

  //default when starting a Calkudaku. we need to read in 3 items.
  //questionBoard, solutionBoard and instruction line.
  public Calkudaku(int [][] questionBoard, int [][] solutionBoard, String []instruction){
    this.questionBoard = questionBoard;
    this.solutionBoard = solutionBoard;
    this.instruction = instruction;
  }
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


  public static void main(String[] args) {
    int [][] qBoard = new int [rows][cols];
    Scanner scan = new Scanner(System.in);
    int countRows = 0;
    while(countRows<6){
      String currentrow = scan.nextLine();
      String [] split = currentrow.split(" ");
      try{
        for (int i = 0;i<split.length;i++){
          int a =Integer.parseInt(split[i]);
          qBoard[countRows][i] = a;
        }
      }catch(NumberFormatException nfe){
        System.out.println("non integer encountered");
      }
      countRows++;
    }
    //questionBoard completed;
    //set instruction line
    String lastLine = scan.nextLine();
    String [] ins = lastLine.split(" ");
    //instruction line completed;
    //give all solution board with 0;
    int [][] sBoard = new int[rows][cols];
    for(int i = 0;i<rows;i++){
      for(int j = 0;j<cols;j++){
        sBoard[i][j]=0;
      }
    }
    Calkudaku solution = new Calkudaku(qBoard,sBoard,ins);//this object created.

  }

}
