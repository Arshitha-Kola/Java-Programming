import java.util.Scanner;

public class StringConcatination {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two strings");
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
//		if(s1.equalsIgnoreCase(s2))
//		{
//			System.out.println(s1+s2);
//		}
//		else
//		{
//			System.out.println("Strins are not equal");
//		}
		Concatination concatination = new Concatination();
		System.out.println(concatination.concat(s1, s2));
		scanner.close();
		
	}

}
