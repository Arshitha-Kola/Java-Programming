
public class ArmstrongNumber {
	public double armstrongChecker(int n,int count)
	{
		double sum=0;
		while(n!=0)
		{
		int rem=n%10;
		sum=sum + Math.pow(rem,count);//or(int)Math.pow(rem,count);
		n=n/10;
		}
		return sum;
	}
}
