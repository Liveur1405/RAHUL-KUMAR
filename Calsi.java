package Polymorphism;

public class Calsi {
	public static void Add(int a,int b)
	{
		System.out.println("Add is 2 no:- "+(a+b));
	}
	public static void Add(int a,int b,int c)
	{
		System.out.println("Add is 2 no:- "+(a+b+c));
	}
	public static void Add(int a,int b,int c,int d)
	{
		System.out.println("Add is 2 no:- "+(a+b+c+d));
	}
	public static void main(String [] args)
	{
		Calsi c=new Calsi();
		c.Add(15, 25);
		c.Add(15, 25,35);
		c.Add(15, 25,35,45);
		
	}
}
