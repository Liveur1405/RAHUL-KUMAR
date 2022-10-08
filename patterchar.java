package Rahulhome;
import java.util.*;
public class patterchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			int j=1;
			while(j<=n)
			{
				char p =(char)('A'+j-1);
				System.out.print(p);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
