import java.util.Scanner;
public class NaturalNumber {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the number:");
			int n=scan.nextInt();
			int sum=0;
			for(int i=0;i<=n;i++)
			{
				sum=sum+i;
			}
			System.out.println("Sum of natural numbers is :"+sum);
			scan.close();
	}
}
