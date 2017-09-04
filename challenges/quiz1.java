public class quiz1{
  public static void main(String[] args) {


    /*String msg = "Pool";
    StringBuilder sb = new StringBuilder(msg); //sb = pool
    StringBuilder sb2 = sb; //sb2 = pool
    System.out.println(sb2.toString());//at this time the sb2 string hasn't yet
    //been updated by sb
    sb.reverse(); //sb= loop
    System.out.println(sb.toString());
    System.out.println(sb2.toString());//sb2 is automaticly updated
    //the sb2 is assigned the reference value of sb using the  = operator.
    //another string builder sb2 can refer to the object job.
    sb = new StringBuilder(msg); //sb = pool
    System.out.println(sb.toString()); //= p00l
    System.out.println(sb2.toString()); //=pool //loop
    */
    //int i;//to see the result out of the loop, define the iterator out of the loop.
    /*for (int i = 0;;){
      System.out.println(i);
    }forever looping, no increment
    */
    int i = 0;
    for (;i<10;){
      System.out.println(i);
      i=i+1;
    }

    //System.out.println(i);//here is what the i really became
    //if you type as : for (;i<10;i=i+1);{
    //System.out.println(i);
    //} it means nothing to execute in the loop and the pl will be then executed
    //after the loop. hence i = 10.

  }
}
