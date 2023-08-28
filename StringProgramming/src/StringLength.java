import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings");
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		if(s1.length()==s2.length())
		{
			System.out.println("Both strings are of same length");
		}
		else
		{
			System.out.println("Both strings are of different length");
		}
		scanner.close();
	}

}
