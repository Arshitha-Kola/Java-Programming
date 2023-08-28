
public class LuAndUl {
	void convert(String s1)
	{
		char ch[]=s1.toCharArray();
		for (int c : ch) {
			if(c>=97 && c<=122)
			{
				System.out.print((char)(c-32));
			}
			if(c>=65 && c<=90)
			{
				int b = c+32;
				System.out.print((char)b);
			}
		}
}
}
