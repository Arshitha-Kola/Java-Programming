import java.util.Scanner;

public class String_UpperandLower {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string ");
		String s1 = scanner.nextLine();
		
		UpperLowercase upperLowercase = new UpperLowercase();
		upperLowercase.count(s1);
		scanner.close();
	}

}
