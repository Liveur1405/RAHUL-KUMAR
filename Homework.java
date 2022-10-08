package Rahulhome;

public class Homework {

	public static void main(String[] args) {
		PrimeNotPrime(56);
		CharToNum('m');
		NumToChar(65);
	}
	public static void PrimeNotPrime(int n)
	{
		int count =0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime number");
		}
	}
	public static void CharToNum(char ch)
	{
		int res= (int)ch;
		System.out.println("Assci value of this char "+res);
	}
	public static void NumToChar(int m) {
		char ch=(char)m;
		System.out.println("m is repersent this char "+ch);
		
	}
}
