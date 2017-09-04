import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;

public class StickyTape {

	public static void main(String[] args) {
		try{
			if(args.length==0){
				throw new IOException();
				//return;
			}
			int len = args.length;
			File [] files = new File[len];
			String [][] texts = new String [len][20000];
			int [] longest = new int[len];
			for(int i = 0;i<len;i++){
				File currFile = new File(args[i]);
				//files[i]=currFile;
				Scanner scan = new Scanner(currFile);
				int j = 0;
				//String currText = scan.nextLine();
				while(scan.hasNextLine()){
					String currText = scan.nextLine();
					texts[i][j]=currText;
					j++;
				}
				longest[i]=j;
			}
			//System.out.println(Arrays.toString(texts));
			Arrays.sort(longest);
			int maxLength = longest[len-1];
			for (int j =0;j<maxLength;j++){
				for(int i = 0;i<len;i++){
					if(texts[i][j]==""){
						System.out.print("\t");
					}else{
						if(i==len-1){
							System.out.print(texts[i][j]);
						}else{
							System.out.print(texts[i][j]+"\t");
						}
					}
				}

				System.out.print("\n");
			}

		}catch(FileNotFoundException fnfe){
			StringBuilder builder = new StringBuilder();
			for(String s : args) {
    		builder.append(" "+s);
			}
			String str = builder.toString();
			System.out.println("Unable to load file"+str);
		}
		catch (IOException ioe){
			System.out.println("No file received");
		}
	}
}
