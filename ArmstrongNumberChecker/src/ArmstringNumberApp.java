import java.util.Scanner;

public class ArmstringNumberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=scan.nextInt();
		int count=0;
		int org=n;
		while(org!=0)//To count the digits
		{
			org=org/10;
			count++;
		}
		ArmstrongNumber a = new ArmstrongNumber();
		double res=a.armstrongChecker(n,count);
		System.out.println("Armstrong of that number is "+res);
		if(n==res)
		{
			System.out.println("Entered number "+n+" is an Armstrong number");
		}
		else
		{
			System.out.println("Entered number "+n+" is NOT an Armstrong number");
		}
		scan.close();
	}

}
