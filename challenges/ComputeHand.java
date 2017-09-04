public class ComputeHand{
  public static void main(String[] args) {
    System.out.println(computeHandShakes(6));
  }
  public static int computeHandShakes(int n){
    if(n ==0||n==1){
      return 0;
    }else{
      return computeHandShakes(n-1)+n-1;
    }
  }
}
