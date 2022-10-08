package Rahulhome;

import java.util.Scanner;

public class alphapattern2 {
	public static void main(String[]args) {
		int i,j,n,k;
 		Scanner sc = new Scanner(System.in);
    		//System.out.println("Enter the no of lines");
 		n=sc.nextInt();
    		for(i=1;i<=n;i++)
    		{
			k=i;
        		for(j=1;j<=i;j++,k++)
        		{ 		
                    char p =(char)(k+64);
            			System.out.print(p);
        		} 
        		System.out.println();
		
	}
		
	}

}
