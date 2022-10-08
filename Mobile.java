package Abstract;

public abstract class Mobile {
	public static void main(String [] args)
	{
		Vivo v=new Vivo();
		v.Ram();
		v.Color();
		Mobile m=new Vivo();
		m.Ram();
		m.Color();
	}
	abstract public void Ram();
	abstract public void Color();

}
class Vivo extends Mobile
{
	public void Ram() {
		System.out.println("8 Gb");
	}
	public void Color(){
		System.out.println("Navy Blue");
	}
}
