package Rahulhome;

public class Book {
	String title;
	String author;
	int noofpages;
	double price;
	public void Pro()
	{
		System.out.println(title);
		System.out.println(author);
		System.out.println(noofpages);
		System.out.println(price);
	}
	public static void main(String[]args)
	{
		Book B1=new Book();
		Book B2=new Book();
		Book B3=new Book();
		Book B4=new Book();
		B1.title="lIFE";
		B1.author="YOU";
		B1.noofpages=100;
		B1.price=5000;
		B2.title="REMEOJULIET";
		B2.author="-------";
		B2.noofpages=400;
		B2.price=0;
		B3.title="HITLER";
		B3.author="VAMSHI";
		B3.noofpages=50;
		B3.price=500;
		B4.title="REBEL";
		B4.author="YOU";
		B4.noofpages=1000000;
		B4.price=0;
		B1.Pro();
		B2.Pro();
		B3.Pro();
		B4.Pro();
		
		
	}

}
