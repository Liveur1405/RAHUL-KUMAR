package Rahulhome;
import java.util.Scanner;
public class demo {
	public static void main(String[]args) {
		 Scanner s= new Scanner(System.in);
	        int x=s.nextInt();
	        int i=1;
	        int N=1;
	        int k; 
	        int count=0;
	        while(N<=1000 && count<x)
	        {
	            k=3*N+2;
	            if(k%4!=0)
	            {
	                System.out.print(k+" ");
	                count++;
	            }

	            N++;  


	        }
		}
}
