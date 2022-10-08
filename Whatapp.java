package Rahulhome;

public class Whatapp {
	String name;
	long conno;
	public Whatapp(String name,long conno)
	{
		this.name=name;
		this.conno=conno;
	}
	public void print()
	{
		System.out.println(name);
		System.out.println(conno);
	}
	public static void main(String [] args)
	{
		Whatapp W1=new Whatapp("Rahul kumar",9304224);
		Whatapp W2=new Whatapp("Rahul kumar",7024401);
		W1.print();
		W2.print();		
	}
}
