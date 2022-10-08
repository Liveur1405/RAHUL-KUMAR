package Rahulhome;
import java.util.*;
public class mirror {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int spaces =1;
			while(spaces<=n-i) {
				System.out.print(' ');
				spaces	=spaces+1;
			}
			int star=1;
			while(star<=i) {
				System.out.print('*');
				star=star+1;
			}
			System.out.println();
			i++;
		}
	}

}
