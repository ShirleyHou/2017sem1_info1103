import java.util.Scanner;
import java.io.*;
import java.util.Arrays;

public class BinarySearch {

	public static int[] readFile(String filename){
		try{
			File f = new File(filename);
			Scanner scan = new Scanner(f);
			String i = scan.nextLine();
			String [] thisLine = i.split(" ");
			int [] toReturn = new int [thisLine.length];
			for (int j = 0;j<thisLine.length;j++){
				toReturn[j]=Integer.parseInt(thisLine[j]);
			}
			Arrays.sort(toReturn);
			return toReturn;
		}catch(FileNotFoundException fne){
			return null;
		}catch(IllegalArgumentException iae){
			return null;
		}
	}

	public static Integer binarySearch(int low, int high, int search, int[] array) {
		int mid = (int)(low+high)/2;
		if (low>=high){
			return null;
		}
		if (array[mid]==search){
			return array[mid];
		}else if (array[mid]<search){
			return binarySearch(mid+1,high,search,array);
		}else{
			return binarySearch(low,mid-1,search,array);
		}

	}

	public static void main(String[] args) {
		if(args.length<2){
			System.out.println("Not enough arguments");
			return;
		}
		int search = Integer.parseInt(args[0]);
		String fileName = args[1];
		int [] a = readFile(fileName);
		int lengthOfFile = a.length;
		int low = a[0];
		int high = a[lengthOfFile-1];

		if(binarySearch(low,high,search,a)==null){
			System.out.println("Not Found");
		}else{
			System.out.println("Found");
		}

	}
}
