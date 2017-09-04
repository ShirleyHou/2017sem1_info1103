class AbstractClassThisAndSupetDemo{

}
abstract class Vehicle{
  String color;
  abstract int getMaximumSpeed();
}
class ModelIT extends Vehicle{
  ModelIT(){
    color = "Black";
    System.out.println("This model IT Ford can be any color you want,"+
    "as long as it is "+ color + ".\n\n From 1908 to 1920.");
  }
  int getMaximumSpeed(){
    System.out.println("The maximum speed is 45 Miles per km");
    return 45;
  }
}
class Tbird extends ModelIT{
  int getMaximumSpeed(){
    System.out.println("The new maximum speed lowers the fuel Efficient");
    return 120;
  }
  void useThisAndSuper(){
    System.out.println("\nThe old maximum speed was"+super.getMaximumSpeed());
    System.out.println("\nThe new maximum speed was"+this.getMaximumSpeed());
  }
}
class AbstractClassThisAndSuperDemo{
  public static void main(String[] args){
    Tbird myTbird = new Tbird();//superclass constructor called
    myTbird.useThisAndSuper();
  }
}
