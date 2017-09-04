import java.util.Scanner;
public class Sudoku{
  private int [][] matrix;
  public Sudoku(int[][] matrix){
    this.matrix = matrix;
  }
  public static void main(String[] args) {
    int sudoku [][]=new int[9][9];
    Scanner scan = new Scanner(System.in);
    int countRows = 0;
    while(countRows<9){
      String currentrow = scan.nextLine();
      String [] split = currentrow.split(" ");
      try{
        for (int i = 0;i<split.length;i++){
          sudoku[countRows][i]=Integer.parseInt(split[i]);
        }
      }catch(NumberFormatException nfe){
        System.out.println("non integer encountered");
      }
      countRows++;
    }
    Sudoku s = new Sudoku(sudoku);
    s.backTrace(0,0);
  }
  //尝试模块
  private void backTrace(int i, int j){
    if(i ==8&&j==9){
      //successfully completed
      System.out.println("Completed");
      printArray();
      return;
    }

      //switch to newLine.
      if(j ==9){
        i++;
        j=0;
      }
      if(matrix[i][j]==0){
        for(int k =1;k<=9;k++){
          if(check(i,j,k)){
            matrix[i][j]=k;
            backTrace(i,j+1);
            matrix[i][j]=0;
          }
        }
      }else{
        backTrace(i,j+1);
      }
    }
    //whether legal to give value into a empty cell.
    //检查模块
    private boolean check(int row, int line, int number){
      for(int i = 0;i<9;i++){
        if(matrix[row][i]==number||matrix[i][line]==number){
          return false;
        }
      }
      return true;
    }
    public void printArray(){
      for(int i = 0;i<9;i++){
        for(int j=0;j<9;j++){
          System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }
      System.out.println();
    }
}
