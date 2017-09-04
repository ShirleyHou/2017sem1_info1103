import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListTest{
  public static void main(String[] args) {
    ArrayList<Integer> List = new ArrayList<Integer>();
    List.add(1);
    List.add(2);
    System.out.println(List);
    //System.out.println(List.get(0));
    System.out.println(Arrays.toString(List.toArray()));
    List.remove(0);
    System.out.println(List.get(0));
    ArrayList<String> List2 = new ArrayList<String>();
    List2.add("Integer");
    List2.add("Double");
    List2.add(0,"String");
    List2.remove("Double");
    List.remove("String");
    System.out.println(List2.size());
    System.out.println(List.size());
    ArrayList<ArrayList> List3 = new ArrayList<ArrayList>();
    List3.add(List2);
    List3.add(List);
    System.out.println(List3.size());
    System.out.println(List3);
    System.out.println(List3.get(0).get(0));
    System.out.println(3%3);

  }
}
