package Rahulhome;

import java.util.Scanner;

public class alphapattern3 {
	public static void main(String[]args) {
		int i,j,n;
 		Scanner sc = new Scanner(System.in);
 		n=sc.nextInt();
    		for(i=n;i>=1;i--)
    		{
        		for(j=i;j<=n;j++)
        		{ 		
        				char p=(char)(j+64);
            			System.out.print(p);
        		} 
        		System.out.println("");
    		}
		
	}

}
