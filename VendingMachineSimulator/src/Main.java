import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the product ID :");
		System.out.print("P01 -- COCA COLA \nP02 -- MAAZA \nP03 -- PEPSI \nP04 -- LIMCA \nP05 -- SLICE \nP06 -- SMOODH ");
		System.out.println();
		String productCode = scan.next();
		getProduct(productCode);
		scan.close();
		
	}
	public static void getProduct(String productCode)
	{
		switch(productCode)
		{
		case "P01":
			System.out.println("Coca Cola");
			break;
			
		case "P02":
			System.out.println("Maaza");
			break;
			
		case "P03":
			System.out.println("Pepsi");
			break;
			
		case "P04":
			System.out.println("Limca");
			break;
			
		case "P05":
			System.out.println("Slice");
			break;
			
		case "P06":
			System.out.println("Smoodh");
			break;
			
		default:
			System.out.println("Please enter the correct ID!!!!!");
			
		}
	}

}
