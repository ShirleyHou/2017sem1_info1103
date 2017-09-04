import java.util.ArrayList;
import java.util.Scanner;
import java.text.*;


public class Statistics {

	// Returns the mean of the given data set.
	public static double mean(ArrayList<Double> numbers) {
		int size = numbers.size();
		double sum = 0;
		for(int i=0;i<size;i++){
			sum = sum+numbers.get(i);
		}
		double mean = sum / size;
		return mean;
	}


	// Returns the variance of the given data set.
	public static double variance(ArrayList<Double> numbers, double mean) {
		int size = numbers.size();
		double sum =0;
		double var =0;
		for (int i=0;i<size;i++){
			sum = sum + Math.pow(numbers.get(i)-mean, 2);
		}
		var = sum/size;
		return var;
	}


	// Returns the standard deviation of the given data set.
	public static double sd(double variance) {

		double sd = Math.sqrt(variance);
		return sd;
	}


	public static void main(String[] args) {
			System.out.println("Enter data set:");
			Scanner scan =  new Scanner(System.in);
			ArrayList <Double> data = new ArrayList<Double>();

			while (scan.hasNextDouble()) {
		    double d = scan.nextDouble();
				data.add(d);
			}


			if(data.size()==0){
				System.out.print("\n");
				System.out.println("No data!");
				return;
			}
			//DecimalFormat myFormatter = new DecimalFormat("0.0000");
			//System.out.println(data.size());
			//System.out.println(data);
			double mean = mean(data);
			//System.out.println(myFormatter.format(mean));
			System.out.print("\n");
			System.out.format("%nMean = %.4f%n",mean);
			double variance = variance(data,mean(data));
			System.out.format("Variance = %.4f%n",variance);
			//System.out.println(myFormatter.format(variance));
			double sd = sd(variance(data,mean(data)));
			System.out.format("Standard deviation = %.4f%n",sd);
			//System.out.println(sd(variance(data,mean(data))));
			//System.out.println(myFormatter.format(sd));

	}
}
