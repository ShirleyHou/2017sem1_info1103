//A Reference based linked list
package List;
class Node{
  public Object item;
  public Node next; //this is a Node object, aiming at linking one object to another.
  Node(Object newItem){
    item = newItem; //--points to a different
    next = null;
  }//end another constructor
  Node(Object newItem, Node nextNode){
    item = newItem;
    next = nextNode;
  }//end constructor

}//end class IntegerNode
//===========To use this==========
//Node n = new Node(new Integer(6))
//////this points a node coded n to an Integer
//////Since we use Objects here we'll have to use wrapper class
//Node first = new Node(new Integer(9), n);
//////this points a node coded first to an Integer 6
//////and also, this node points to node n.
//////This node 'links' the point to n
//================================
