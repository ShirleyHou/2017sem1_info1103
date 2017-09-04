package List;
//***********************************
//Interface for the ADT list
//***********************************
public class ListReferenceBased implements ListInterface{
  private Node head; //directly use Node Class. (and Node Constructor)
  private int numItems;//随着add／delete增减，数一共有几枚Item存着
  private Object item;
  //list operations

  //**********************************
  //Default Constructor
  //**********************************
  public ListReferenceBased(){
    this.numItems = 0;
    this.head = null;
  }//this is pretty unnecessray.

  public boolean isEmpty(){
    return (numItems == 0);//如果item数是0那就
  }//end isEmpty

  public int size(){
    return numItems;//随着add／delete增减，数一共有几枚Item存着
  }//end size;

  //because a linked list does not provide direct access to a specified
  //position. hence all the operation has to traverse the list from its
  //beginning to the targeted position.
  //****************************************
  //this is more than locate than find.
  //it basicly tell you the 'nth' node name
  //****************************************
  private Node find(int index){//确定要动作的index的位置所对应的Node
    //-----------
    //locates a specified node in a linked list
    //precondition: index is the number of the desired node
    //1<=index <=numItems+1;Index是第一个node的序列，所以是1～n+1
    //-----------
    //postCondition: returns a reference to the desired node
    //-----------
    Node curr = head; //startin from the first node
    for(int skip = 0; skip<index;skip++){ //在skip循环内的内容都是仅仅查找用，
      //会被省略的
      curr = curr.next;
    }
    return curr;
  }//end find

  public void add(int index, Object item) throws ListIndexOutOfBoundsException{
    if(index>=0 && index<numItems+1){//目标位置可以和numItem一样 因为我们这里不像
      //array有什么限制
      if(index == 0){
        //this means the user wants to add on the beginning of the node
        Node newNode = new Node(item,head);//直接用Node Constructor
        //让新node当头，新node的尾链旧的头.

        head = newNode;//不要忘记了head是一个Node Object
      }else{
        Node prev = find(index-1); //prev标记出当前index所对应的node的前一个node
        Node insertNode = new Node(item, prev.next);
        //prev原本的后一个node（prev.next)被替换成insertNode所指
        prev.next = insertNode;
        //insert
      }
      numItems++;
    }else{
      throw new ListIndexOutOfBoundsException("List index out of bounds on add");

    }
  }

  public void remove(int index) throws ListIndexOutOfBoundsException{
    if(index>=0 && index<numItems){//从已经有的里面删除数意味着要像array一样不可以超
      if(index == 0){
        head = head.next;
        //替换head指向的位置。

      }else{
        Node prev = find(index-1); //prev标记出当前index所对应的node的前一个node
        Node curr = prev.next;
        prev.next = curr.next;
      }
      numItems--;
    }else{
      throw new ListIndexOutOfBoundsException("List index out of bounds on remove");
    }
  }
  public Object get(int index) throws ListIndexOutOfBoundsException{
    if(index>=0 && index<numItems){//从已经有的里面删除数意味着要像array一样不可以超
      //get reference to node, then data in node;
      Node curr = find(index);
      Object dataItem = curr.item;
      return dataItem;
    }else{
      throw new ListIndexOutOfBoundsException("List index out of bounds on get");
    }
  }
  public void removeAll(){
    head = null;
    numItems = 0;
  }
}// end ListInterface
