package Rahulhome;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		int n;
		Scanner kb=new Scanner("System.in");
		n=kb.nextInt();
		for(int i=2;i<=n;i++)
		{
			if(n%i==0) {
				System.out.println(i+"");
			}
		}
		
	}

}
