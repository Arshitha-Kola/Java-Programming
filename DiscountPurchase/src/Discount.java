import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount :");
		double purchase = scan.nextDouble();
		checkDiscount(purchase);
	}
	public static void checkDiscount(double a) {
		if(a>100)
		{
			System.out.println("Discount Applicable!");
		}
		else
		{
			System.out.println("Discount not applicable!");
		}
	}
}
