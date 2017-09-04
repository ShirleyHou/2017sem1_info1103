public class printTriangle{
  public static void main(String[] args) {
    int sides = 5;
    int rows = sides*2;//4
    int cols = 2*rows;//8
    //0-- 4
    for(int i=0;i<rows;i++){
      //0-8
      for (int j = 0;j<cols;j++){
        if (j == (rows-i-1) || (i>=sides && j==cols-i-1)){
          System.out.print('/');
        }else if(j == (rows+i)|| (i>=sides && j==i)){
          System.out.print('\\');
        }else if(i == rows-1||i== sides-1 && j>=sides &&j<(cols-sides)){
          System.out.print('_');
        }else{
          System.out.print(' ');

        }

      }
      System.out.print('\n');
    }
  }

}
