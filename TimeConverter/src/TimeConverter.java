import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int min = scan.nextInt();
		System.out.println(convertToHours(min));
		scan.close();	
	}
	public static double convertToHours(int minutes) {
		return minutes/60.0;
	}
}
