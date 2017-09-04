/*an array based implementation
+ createList()
+ isEmpty(): boolean
+ size(): integer
+ remove(in index: integer)
+ removeAll()
+ get(in index: integer ):listItemType
*/

//interface does not contain body.
//interface cannot define non-static methods in it
//generally speaking, interface cannor define methods in it.
//only state 'what method will be implementated for the submethods'
//within the interface, comment on all the detail structure of
//methods, but DO NOT implement any of them.
public interface IntegerListInterface{
  public boolean isEmpty();
  //determines whether a list is empty
  //Precondition: none;
  //Postcondition: return true if the list is empty.
  //Throws: none.

  public int size();
  //Determines the length of the list.
  //Precondition: none;
  //Postcondition: return the integer of number of items in the list
  //Throws: none.

  public void removeAll();
  //Deletes all the items from the list
  //Precondition:none;
  //Postcondition: the list is empty
  //throws: none.

  public void add(int index, Object item)
  throws ListIndexOutOfBoundsException,ListException;
  //Adds an item to the list at position index
  //Precondition: index indicates the position at which the item should
  //be in the list
  //Postcondition:If insertion is successful, item is at position index in
  //the left, and other items are renumbered accordingly
  //Throws: ListIndexOutOfBoundsException if index<0 or index>size()
  //Throws: ListException if item cannot be placed in the list
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

}//end of IntegerListInterface
