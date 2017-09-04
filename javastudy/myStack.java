package myStack;

public interface myStack{
  public void push(Object e);
  public void pop();
  public int size();
  public boolean isEmpty();
  public Object top() throws myStackIsEmptyException;
}
