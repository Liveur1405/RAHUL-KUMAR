package Rahulhome;

public class MethodReturn {

	public static void main(String[] args) {
		double res = Add(5.3,6.7);
		System.out.println("Sum of two number:- "+res);
		int last=LastDigit(4526);
		System.out.println("lastdigit is:- "+last);
		int res1= Factoriol(5);
		System.out.println("fact is:- "+res1);
		

	}
	public static double Add(double a, double b)
	{
		double res=a+b;
		return res;
		
	}
	public static int LastDigit(int n)
	{
		int last=n%10;
		return last;
		
	}
	public static int Factoriol(int m)
	{
		int fact=1;
		for(int i=1;i<=m;i++)
		{
			fact*=i;
		}
		return fact;
	}

}
