package List;
public class ListIndexOutOfBoundsException extends IndexOutOfBoundsException{
  static final long serialVersionUID = 123123123;
  public ListIndexOutOfBoundsException(String s){
    super(s);
  }//constructor;

  //the ListIndexOutOfBoundsException basicly copied the original
  //IndexOutOfBoundsException given by java default
  //The java default gives 2 constructors:
  //the one with message s
  //public indexOutOfBoundsException(String s)
  //and the one with no specific value.
}
