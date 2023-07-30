import java.util.Scanner;

public class NaturalNumbersEg {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice :[performed on numbers from 1 to 100]");
		System.out.print(" 1--Divisibility by 2 \n 2--Divisibility by 3 \n 3--Divisibility of 5 \n");
		System.out.print(" 4--Divisibility by 2,5 \n 5--Divisibility by 3 and comes in table 5 \n 6--Prime numbers \n");
		System.out.println(" 7--Even numbers divisible by 3 \n 8--Odd numbers divisible by 5  ");
		int choice = scan.nextInt();
		Demo d = new Demo();
		
		switch(choice)
		{
		case 0:
		{
			System.out.println("ALL NUMBERS FROM 1 TO 100");
			d.printNumbers();
			break;
		}
		case 1:
		{
			System.out.println("ALL NUMBERS DIVISIBLE BY 2");
			d.TwoDivisibility();
			break;
		}
		case 2:
		{
			System.out.println("ALL NUMBERS DIVISIBLE BY 3");
			d.ThreeDivisibility();
			break;
		}
		case 3:
		{
		System.out.println("ALL NUMBERS DIVISIBLE BY 5");
		d.FiveDivisibility();
		break;
		}
		case 4:
		{
		System.out.println("ALL NUMBERS DIVISIBLE BY 2 and 5");
		d.TwoAndFiveDivisibility();
		break;
		}
		case 5:
		{
		System.out.println("ALL NUMBERS DIVISIBLE BY 3 and 5 ");
		d.ThreeAndFiveDivisibility();
		break;
		}
		case 7:
		{
		System.out.println("ALL EVEN NUMBERS DIVISIBLE BY 3");
		d.EvenAndThreeDivisibility();
		break;
		}
		case 8:
		{
		System.out.println("ALL ODD NUMBERS DIVISIBLE BY 5");
		d.OddAndFiveDivisibility();
		break;
		}
		default:
		{
			System.out.println("Enter the right number!!");
		}
		}
		
	}

}
