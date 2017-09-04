import java.util.Scanner;
public class Stem {

	private static final String[] suffixes = {
		"able", "al", "ance", "ant", "ate", "ed",
		"ence", "ent", "er", "es", "ful", "ible",
		"ic", "ing", "ism", "ist", "less", "ment",
		"ness", "s", "tion", "tions", "tional"
	};

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter word: ");
		String toTrim = scan.next();
		if(toTrim.length()<=2){
			System.out.println("\n"+toTrim+" cannot be stemmed.");
			return;
		}
		for(int i = 0 ; i < suffixes.length ;i++){
			String currWord = suffixes[i];
			if(toTrim.equals(currWord)){
				System.out.println("\n"+currWord);
				return;
			}
			int currWordLen = currWord.length();
			int endIndex = toTrim.length()-currWordLen;
			if(toTrim.substring(endIndex).equals(currWord)){
				System.out.println("\n"+toTrim.substring(0,endIndex));
				return;
			}
		}
		System.out.println("\n"+toTrim);

	}
}
