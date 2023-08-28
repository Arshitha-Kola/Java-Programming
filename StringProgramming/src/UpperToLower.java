
public class UpperToLower {
void convertToLower(String s1)
{
	char ch[] = s1.toCharArray();
	for (int c : ch) {
		if(c>=65 && c<=90)
		{
			int b = c+32;
			System.out.print((char)b);
		}
		else
		{
			System.out.print((char)c);
		}	
	}
}
}
