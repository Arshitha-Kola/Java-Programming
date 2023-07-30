import java.util.Scanner;

public class GCDApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers to find the GCD :");
		int m = scan.nextInt();
		int n = scan.nextInt();
		System.out.println("GCD of "+m+" and "+n+" is : "+GCD.TofindGCD(m,n));
		scan.close();
	}
}
