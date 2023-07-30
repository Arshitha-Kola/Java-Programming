import java.util.Scanner;

public class ReverseOfTheNumberApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to reverse it :");
		int n =scan.nextInt();
		ReverseOfTheNumber r = new ReverseOfTheNumber();
		int res = r.reversing(n);
		System.out.println("The reversing of the number is "+res);
		if(n==res)
		{
			System.out.println("The number "+n+" is a palindrome!");
		}
		else
		{
			System.out.println("The number "+n+" is not a palindrome!");
		}
		scan.close();
		}

}
