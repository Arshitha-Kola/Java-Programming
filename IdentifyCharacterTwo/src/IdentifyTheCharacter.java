import java.util.Scanner;

public class IdentifyTheCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character to check for consonent,vowel,digit or special character:");
		char ch = scan.next().charAt(0);
		identifyCharacter(ch);
		
	}
	public static void identifyCharacter(char ch) {
		if(Character.isDigit(ch))
		{
			System.out.println("The entered character "+ch+" is a digit!");
		}
		else if(!Character.isLetter(ch))
		{
			System.out.println("The entered character "+ch+" is special character!");
		}
		else
		{
			switch(Character.toLowerCase(ch))//only converting to check for conditions
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch))//It doesn't change the value present in ch
				{
					System.out.println("The entered character "+ch+" is lower-case vowel");
				}
				else
				{
					System.out.println("The entered character "+ch+" is upper-case vowel");
				}
				break;
			default:
			{
				if(Character.isLowerCase(ch))
				{
					System.out.println("The entered character "+ch+" is lower-case consonent");
				}
				else
				{
					System.out.println("The entered character "+ch+" is upper-case consonent");
				}
			}
			}
		}
	}

}
