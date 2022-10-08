package Rahulhome;

import java.util.Scanner;

public class alphapattern {
	public static void main(String[]args) {
		int i,j,n;
 		Scanner sc = new Scanner(System.in);
 		n=sc.nextInt();
    		for(i=1;i<=n;i++)
    		{
        		for(j=1;j<=i;j++)
        		{
        				char p=(char)(i+64);
            			System.out.print(p);
        		}
 
        		System.out.println("");
    		}
		
	}

}
