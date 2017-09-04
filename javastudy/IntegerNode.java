//A Reference based linked list
package IntegerList;
class IntegerNode{
  public int item;
  public IntegerNode next; //this is a IntegerNode object, aiming at
  //linking one object to another.
  IntegerNode(int newItem){
    item = newItem; //--points to a different
    next = null;
  }//end another constructor
  IntegerNode(int newItem, IntegerNode nextNode){
    item = newItem;
    next = nextNode;
  }//end constructor

}//end class IntegerNode
