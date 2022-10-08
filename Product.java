package Inheritance.inhertancedemo1;

public class Product {
	String pname;
	int pid;
	double price;
	public static void main(String [] args)
	{
		Product p= new Moblie("vivo",1245,29999,16);
		System.out.println(p.pname);
		System.out.println(p.pid);
		System.out.println(p.price);
		Moblie m=(Moblie)p;
		System.out.println(m.ram);
		System.out.println("--------------------------");
		Product p1= new PowerBank("MI",12455,999,16000);
		System.out.println(p1.pname);
		System.out.println(p1.pid);
		System.out.println(p1.price);
		PowerBank PB=(PowerBank)p1;
		System.out.println(PB.mah);
		System.out.println("--------------------------");
		Product p2= new Shirt("PeterEngland",12555,9999,42);
		System.out.println(p2.pname);
		System.out.println(p2.pid);
		System.out.println(p2.price);
		Shirt s=(Shirt)p2;
		System.out.println(s.size);
	}
}
class Moblie extends Product
{
	int ram;
	Moblie(String pname,int pid,double price,int ram)
	{
		this.pname=pname;
		this.pid=pid;
		this.price=price;
		this.ram=ram;
	}
}
class PowerBank extends Product
{
	int mah;
	PowerBank(String pname,int pid,double price,int mah)
	{
		this.pname=pname;
		this.pid=pid;
		this.price=price;
		this.mah=mah;
	}
}
class Shirt extends Product
{
	int size;
	Shirt(String pname,int pid,double price,int size)
	{
		this.pname=pname;
		this.pid=pid;
		this.price=price;
		this.size=size;
	}}
