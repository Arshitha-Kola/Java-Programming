
public class UpperLowercase {
void count(String s1) {
	int count=0;
	int count1=0;
	char ch[] = s1.toCharArray();
	for (int c : ch) {
		if(c>=65 && c<=90)
		{
			count++;
		}
		else if(c>=97 && c<=122)
		{
			count1++;
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	System.out.println("Uppercase count "+count);
	System.out.println("Lowercase count "+count1);
	
}
}
