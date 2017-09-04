import java.util.Scanner;
import java.util.Arrays;
public class Anagram {

	// Returns a copy of the given string that
	// contains the characters sorted order.
	public static String sort(String s) {
		String [] sorting = s.split("");
		Arrays.sort(sorting);
		return(Arrays.toString(sorting));
	}

	// Returns a copy of the given string that is transformed into
	// lowercase and removes all non alphanumeric characters.
	public static String tidy(String s) {
		String t =s.replaceAll("[^0-9A-Za-z]","");
		return(t.toLowerCase());
	}

	public static void main(String[] args) {
		System.out.print("Enter line: ");
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		System.out.print("Enter anagram: ");
		String anagram = scan.nextLine();
		if (sort(tidy(line)).equals(sort(tidy(anagram)))){
			System.out.println("\nAnagram!");
		}else{
			System.out.println("\nNot an anagram.");
		}

	}
}
