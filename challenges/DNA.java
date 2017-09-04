import java.util.Scanner;
import java.lang.StringBuilder;
import java.util.Arrays;

public class DNA {
	public static String matchingLine(String str){
		StringBuilder result = new StringBuilder("");//the right way to use StringBuilder
		//is to give it some content
		for (int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'){
				result.append('t');
			}else if(str.charAt(i)=='A'){
				result.append('T');
			}else if(str.charAt(i)=='t'){
				result.append('a');
			}else if(str.charAt(i)=='T'){
				result.append('A');
			}else if(str.charAt(i)=='c'){
				result.append('g');
			}else if(str.charAt(i)=='C'){
				result.append('G');
			}else if(str.charAt(i)=='g'){
				result.append('c');
			}else if(str.charAt(i)=='G'){
				result.append('C');
			}else if(str.charAt(i)==' '){
				result.append(' ');
			}else{
				result.append('x');;
			}
		}
		return(result.toString());
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//scan.nextLine();
		System.out.print("Enter strand: ");
		String input = scan.nextLine();
		if(input.length()==0){
			System.out.println("No strand provided.");
			return;
		}else{
			System.out.println("Complementary strand is "+matchingLine(input));
		}
	}
}
