public class quiz2{
  public static void main(String[] args) {
    int [] test1 = {45, 23, 56, 78, 47, -39};
    int [] test2 = {5, 102, 44, 28, 2000};
    int [] test3 = {};
    int [] test4 = {47,1,2,3};
    System.out.println(findFirstTwo(test1));
    System.out.println(findFirstTwo(test2));
    System.out.println(findFirstTwo(test3));
    System.out.println(findFirstTwo(test4));
  }
  public static int findFirstTwo(int[] array){
    if(array.length==0){
      return -3;
    }
    int [] picked = new int [2];
    //int [] indices = new int [2];
    int count = 0;
    for(int i =0;i<array.length;i++){
      if(array[i]>=47&&array[i]<=78&&count<2){
        picked[count]=array[i];
        //indices[count]=i;
        count++;
      }
    }
    if(count ==2){
      int firstNumber = picked[0];
      int secondNumber = picked[1];
      int sum = firstNumber+secondNumber;
      return sum;
    }else if (count == 1){
      return -1;
    }else{
      return -2;
    }
  }
}
