import java.util.Scanner;

public class StringUnicode {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a string");
	String s1 = scanner.nextLine();
	System.out.println("The entered string is "+s1);
	char ch[] = s1.toCharArray();
	
	System.out.println("The unicode for string is :");
//	for (int c : ch) {
//		System.out.print(c+" | ");
//	}
	for(int i=0;i<ch.length-1;i++)
	{
		System.out.println((int)ch[i]+" ");
	}
	//OR
//	for(int i=0;i<=s1.length()-1;i++) {
//		System.out.println((int)s1.charAt(i));
//	}
	scanner.close();
}
}
