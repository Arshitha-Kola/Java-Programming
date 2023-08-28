import java.util.Scanner;

public class String_ul_lu_conversion {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string ");
		String s1 = scanner.nextLine();
		
		LuAndUl luAndUl = new LuAndUl();
		luAndUl.convert(s1);
		scanner.close();
	}

}
