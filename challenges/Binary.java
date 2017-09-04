import java.util.*;

public class Binary {

	// Returns decimal representation of given binary number.
	public static int toDecimal(String b) {
    //b = 0100101100
    int count = 0;
    int digits = b.length();
    for (int i = 0;i<digits;i++){
      count = count+ Character.getNumericValue(b.charAt(i))*2^(digits-1-i);
    }
    return count;
	}

	// Returns whether or not given string is a binary number.
	public static boolean isBinary(String b) {
    return true;
	}

	public static void main(String[] args) {

	  System.out.println(toDecimal("1010"));
	}
}
