
public class LowerToUpper {
void convert(String s1)
{
	char ch[]=s1.toCharArray();
	for (int c : ch) {
		if(c>=97 && c<=122)
		{
			System.out.print((char)(c-32));
		}
		else
		{
			System.out.print((char)c);
		}
	}
	
	
}
}
