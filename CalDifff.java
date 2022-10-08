package Rahulhome;
import java.util.*;
import java.util.Arrays;
public class CalDifff {
	public static void main(String [] args)
	{
		int max,max1,min1,min,diff,sum,sum1;
//		int a=3,b=4,c=5;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a three number");
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=sc.nextInt();
		String str="3,4,5";
//		String str=String.valueOf(a);
//		String str1=String.valueOf(b);
//		String str2=String.valueOf(c);
		
		String[] s=str.split(",");
		int x[]=new int[s.length];
		for(int i=0;i<s.length;i++) {
			x[i]=Integer.valueOf(s[i]);
		}
		
		max=Math.max(x[0],x[1]);
		max1=Math.max(x[1], x[2]);
		System.out.println(max+" max num1");
		System.out.println(max1+" max num2");
		min=Math.min(x[0], x[2]);
		min1=Math.min(x[1], x[2]);
		System.out.println(min+" min num1");
		System.out.println(min1+" min num2");
		sum=max*max+max1*max1;
		sum1=min*min+min1*min1;
		System.out.println("sum of squares of thr two largest number "+sum);
		System.out.println("Sum of squares of the two smallest number "+sum1);
		diff=sum-sum1;
		System.out.println("difference between two squares number"+diff);
	}

}
