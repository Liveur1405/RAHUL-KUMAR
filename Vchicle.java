package Abstract;

public abstract class Vchicle {
	public static void main(String[]args) {
		Bike b=new Bike();
		System.out.println(b.getNoOfWeels());
		System.out.println("==================");
		Vchicle v=new Bike();
		System.out.println(v.getNoOfWeels());
	}
public abstract int getNoOfWeels();
}
class Bike extends Vchicle{
	public  int getNoOfWeels()
	{
		return 2;
	}
}
