package Rahulhome;

import java.util.Scanner;

public class reversenumberpattern {

	public static void main(String[] args) {
		int i,j,n;
 		Scanner sc = new Scanner(System.in);
    		//System.out.println("Enter the no of lines");
 		n=sc.nextInt();
    		for(i=1;i<=n;i++)
    		{
        		for(j=i;j>=1;j--)
        		{
            			System.out.print(j);
        		}
 
        		System.out.println("");
    		}
	}

}
