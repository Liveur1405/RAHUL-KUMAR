package Inheritance.inhertancedemo1.Supar;

public class Vechicle {
	String vname;
	int model;
	double price;
	public static void main(String [] args)
	{
		Bike b= new Bike("Yamaha YZF R1",2022,150000,998);
		b.Bprint();
	}
	Vechicle(String vname,int model,double price)
	{
		this.vname=vname;
		this.model=model;
		this.price=price;
	}
}
class Bike extends Vechicle{
	int cc;
	Bike(String vname, int model, double price ,int cc) {
		super(vname, model, price);
		this.cc=cc;
	}

public void Bprint()
{
	System.out.println("Vechicle name is:_ "+vname);
	System.out.println("Vechicle model is:- "+model);
	System.out.println("Vechicle price is:- "+price);
	System.out.println("Vechicle cc is:- "+cc);
	System.out.println("=============================");
}	
}
