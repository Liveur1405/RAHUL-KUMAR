package Rahulhome;
import java.util.*;
public class LastToFirst {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String a =sc.next();
		int n=a.length();
		int x=0;
		int j=0,k=n-1;
		if(n%2==0)
		{
			x=n/2;
		}
		else
		{
			x=n/2;
			x++;
		}
		for(int i=0;i<x;i++)
		{
			for(int r=j;r<k;r++)
			{
				System.out.print(a.charAt(r));
			}
			j++;
			k--;
			System.out.println();
		}
	}

}
