import java.util.Scanner;

public class SemesterMarksAverager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sem1 = sc.nextInt();
		int sem2 = sc.nextInt();
		int sem3 = sc.nextInt();
		int sem4 = sc.nextInt();
		int sem5 = sc.nextInt();
		int sem6 = sc.nextInt();
		int sem7 = sc.nextInt();
		int sem8 = sc.nextInt();
		System.out.printf("%.2f",calculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8));
	}
		public static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7, int sem8) {
	    return (sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8)/8.0;//int / real number will give point 88
}
}//85, 79, 91, 76, 88, 95, 80, 85
