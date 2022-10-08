package Abstract;

abstract public class Car {
	public static void main(String [] args) {
		Suv s=new Suv();
		s.NoOfWeels();
		s.Cc();
		s.Color();
		System.out.println("-------------------------");
		Car c=new Suv();
		c.NoOfWeels();
		c.Cc();
		c.Color();
	}
	public void NoOfWeels()
	{
		System.out.println("4 Weels");
	}
	abstract public void Cc();
	abstract public void Color();
}
class Suv extends Car{
	public void Cc() {
		System.out.println("1250 cc");
	}
	public void Color() {
		System.out.println("Gray color");
	}
}