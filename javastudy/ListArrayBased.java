public class ListArrayBased implements IntegerListInterface{
  private static final int max_int = 100;
  private Object items []; //the list to store any OBJECTS --
  //it does not need to be specified to certain class!!
  private int numItems; //for counting in index.

  public ListArrayBased(){
    items = new Object [max_int];
    numItems = 0; //haven't added any values yet.

    //this list array aims generate max_int amount of objects and store
    //them together.
  }

  @Override
  public boolean isEmpty(){
    if(numItems==0)return true;
    else return false;
  }

  public int size(){
    return numItems;
  }

  public void removeAll(){
    for (int i = 0;i<max_int;i++){
      items[i]=null;
    }
  }

  public void add(int index, Object item) throws ListIndexOutOfBoundsException,ListException;{
  //Adds an item to the list at position index
    if(index>=max_int){
      throw new ListIndexOutOfBoundsException("exceed maximum storage");
    }if(index>=0&&index<max_int-1){
      for (int j = index; j<max_int-1;j++){
        item[j+1] = item[j];
      }
      item[index] = item;
    }else{
      throw new ListException("");
    }


  //Postcondition:If insertion is successful, item is at position index in
  //the left, and other items are renumbered accordingly
  //Throws: ListIndexOutOfBoundsException if index<0 or index>size()
  //Throws: ListException if item cannot be placed in the list
  }
  public int get(int index) throws ListIndexOutOfBoundsException;
  //retrives a list item by position
  //precondition: index indicates the position of target item
  //Postcondition: if 0<=index < size(), the item at position index
  //can then be returned
  //Throws: ListIndexOutOfBoundsException if index<0 or index>size()-1
  public void remove(int index) throws ListIndexOutOfBoundsException;
  //pre: index notes the taget position to be removed
  //post: values at the index will be deleted and all values after that
  //position will be shifted one position forward.
  //Throws: ListIndexOutOfBoundsException if index<0 or index>size()-1

}
