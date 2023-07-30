	import java.util.Scanner;
public class FactorsOfNumber {
		public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter the number:");
			int n = scan.nextInt();
			System.out.print("The factors are");
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					System.out.print(" ,"+i);
				}
			}
			scan.close();
	}
}
