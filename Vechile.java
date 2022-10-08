package Inheritance.inhertancedemo1;

public class Vechile {
	String barnd;
	int noweels;
	int cc;
}
class Bike extends Vechile
{
	public Bike(String barnd,int noweels,int cc)
	{
		this.barnd=barnd;
		this.noweels=noweels;
		this.cc=cc;
	}
	
}