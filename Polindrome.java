package Rahulhome;

import java.util.Scanner;

public class Polindrome {
public static void main(String[]args)
	{
		int n,s=0,c,r;
		System.out.println("Enter any number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0)
		{
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(c==s)
		{
			System.out.print("It's Palindrome number");//reverse the number and get get same number its Palindrome
		}
		else
		{
			System.out.print("It's not Palindrome number");
		}
	}
}
