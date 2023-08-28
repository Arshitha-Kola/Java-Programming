import java.util.Scanner;

public class StringLowerToUpper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string ");
		String s1 = scanner.nextLine();
		
		LowerToUpper lowerToUpper = new LowerToUpper();
		lowerToUpper.convert(s1);
		scanner.close();
	}
}
