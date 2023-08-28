import java.util.Scanner;

public class String_UppertoLower {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string ");
		String s1 = scanner.nextLine();
		
		UpperToLower upperToLower = new UpperToLower();
		upperToLower.convertToLower(s1);
		scanner.close();
	}

}
