import java.util.Arrays;
public class findLargest{
  public static void main(String[] args) {
    int [] findMax = {1,2,3,4,5,6,7,8,9};
    //System.out.println(maxArray(findMax, 8));
    System.out.println(binaryValue(findMax,0,8,5));
  }


  //find recursively search from the end index
  public static int maxArray(int [] anArray, int index){
    if(index>0){
      return Math.max(anArray[index],maxArray(anArray, index-1));
    }else{
      return anArray[0];
    }
  }

  //find an element recursively with binary search way
  //notice here the array should be already sorted.
  public static int binaryValue(int [] anArray, int first, int last, int value){
    int index;
    //if unsorted, this step is not applicable
    //this means it takes
    int mid = (first+last)/2;
    if (first>last){
      //because mid++, or mid--, it will encounter the last index value anyway.
      return -1; //the base case for element is not in the original array
    }
    if(value == anArray[mid]){
      //the case when the value is found and the index is passed back.
      return mid;
    }else{
      //since the array has already been sorted
      //we simply need to slice the array into half, quarter...
      if(value< anArray[mid]) index = binaryValue(anArray,first, mid-1, value);
      else index = binaryValue(anArray, mid+1, last, value);
    }
    return index;
    //getting the kth smallest item out of array.
  }
}
