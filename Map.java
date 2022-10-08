package Polymorphism;

public class Map {
	public static void main(String [] args)
	{
		Map2 m=new Map2();
		m.Route();
		m.Haired();
		System.out.println("=======================");
		Map1 m1=new Map1();
		m1.Route();
//		m1.Haired();
		System.out.println("=======================");
		Map m2=new Map1();
		m2.Route();
//		m2.Haired();
		
	}
	public void Route()
	{
		System.out.println("Direction");
	}

}
class Map1 extends Map{
	public void Route()
	{
		System.out.println("Direction");
		System.out.println("Traffic level");
	}
}
class Map2 extends Map1
{
	public void Route()
	{
		System.out.println("Direction");
		System.out.println("Traffic level");
		System.out.println("Duration");
	}
	public void Haired()
	{
		System.out.println("Bike");
		System.out.println("car");
		System.out.println("SUV");
		System.out.println("Prime car");
	}
	}
