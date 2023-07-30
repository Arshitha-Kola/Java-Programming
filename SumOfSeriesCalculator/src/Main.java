import java.util.Scanner;

public class Main {
	
	public static void calculateSumOfSeries(int n)
	{
		double sum=0;
		for(double i=1;i<=n;i++)
		{
			double a = 1/i;
			sum=sum+a;
		}
		System.out.println("The sum of series is:"+sum);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for series sum:");
		int n = scan.nextInt();
		calculateSumOfSeries(n);
		scan.close();
	}

}
