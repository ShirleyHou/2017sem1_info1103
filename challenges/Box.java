public class Box{
  public static void main(String[] args) {
    if (args.length == 0){
      System.out.println("No arguments");
      return;
    }
    else if(args.length>2){
      System.out.println("Too much arguments");
      return;
    }else if(args.length<2){
      System.out.println("Too few arguments");
      return;
    }else{
      //this is the part where 2 arguments
      //if width is negative
      int width = Integer.parseInt(args[0]);
      int height =  Integer.parseInt(args[1]);

      if(width<0&&height<0){
        System.out.println("Negative dimensions");
        return;
      }else if(width<0){
        System.out.println("Negative width");
        return;
      }else if(height<0){
        System.out.println("Negative height");
        return;
      }else{
        for (int r =0;r<height;r++){
          for (int c = 0;c<width;c++){
            System.out.print('*');
          }
          //if(r!=height-1){
            System.out.print("\n");
          //}

        }
      }
    }
  }
}
