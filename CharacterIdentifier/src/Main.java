import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your input character :");
		char ch = scan.next().charAt(0);
		identifyCharacter(ch);

	}
	public static void identifyCharacter(char ch)//Approach 1
	{
		
	if(Character.isDigit(ch))	
	{
		System.out.println("The enterted character "+ch+" is a digit! ");
	}
	
	
	else if(Character.isLowerCase(ch))
	{
		if(ch=='a' | ch=='e' | ch=='i' | ch=='o' | ch=='u')
		{
		System.out.println("The enterted character "+ch+" is a lower-case vowel! ");
		}
		else
		{
		System.out.println("The enterted character "+ch+" is a lower-case consonent! ");
		}
	}
	
	
	else if(Character.isUpperCase(ch))
		{
			if(ch=='A' | ch=='E' | ch=='I' | ch=='O' | ch=='U')
			{
			System.out.println("The enterted character "+ch+" is a upper-case vowel! ");
			}
			else
			{
			System.out.println("The enterted character "+ch+" is a upper-case consonent! ");
			}
		}
	
	
	else
	{
		System.out.println("The enterted character "+ch+" is a special character! ");
	}
	}
	}

