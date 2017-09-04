package List;
class UseNode{
  public static void main(String[] args) {
    Node n = new Node(new Integer(1));
    Node first = new Node(new Integer(2),n);
    Node second = new Node(new Integer(3),first);
    Node third = new Node(new Integer(4),second);
    Node fourth = new Node(new Integer(5),third);
    Node fifth = new Node(new Integer(6),fourth);
  //  System.out.println(n.next);
  //  System.out.println(first.next);
    //reference the beginning of linked list
    Node head = fifth;


    while(head!= null){ //this stops when propergates to Node n.
      System.out.println(head.item);
      head = head.next;
    }
  }
  
}
