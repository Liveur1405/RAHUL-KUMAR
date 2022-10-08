package Polymorphism;

public class Wav {
	public static void main(String[] args)
	{
		Wav p=new Wav1();
		p.Smessage();
//		p.Amessage();
		Wav1 p1 =new Wav1();
		p1.Smessage();
		p1.Amessage();
	}
	public void Smessage()
	{
		System.out.println("Send message");
	}

}
class Wav1 extends Wav
{
	public void Smessage(){
		System.out.println("Send message");
	}
	public void Amessage()
	{
		System.out.println("Audio message");
	}
}
