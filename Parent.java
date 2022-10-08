package Abstract;

abstract public class Parent {
	public static void main(String [] args)
	{
		
	}
	public abstract void GolddLone();
	public abstract void HomeLone();
}
abstract  class Rahul extends Parent
{
	public void GoldLone() {
		System.out.println("Golad Lone paid by Rahul");
	}
	}
 class Jrahul extends Rahul
{
	public void HomeLone() {
		System.out.println("Home lone paid by J Rahul");
	}
	}