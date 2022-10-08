package Inheritance;

public class App {
	String name;
	int size;
	
}
class Facebook extends App
{
	String id;
	public Facebook(String name,int size,String id)
	{
		this.name=name;
		this.size=size;
		this.id=id;
	}
	}
class Whatapps extends App
{
	long cno;
	public Whatapps(String name,int size,long cno)
	{
		this.name=name;
		this.size=size;
		this.cno=cno;
				
	}
	
}
class Main{
public static void main(String [] args)
{
	App a=new Facebook("Rahul Rai",36,"Rahulrai4234@gmail.com");
	App a1=new Whatapps("Reble rai",32,9304224945l);
	System.out.println(a.name);
	System.out.println(a.size);
	//System.out.println(a.id);
	System.out.println(a1.name);
	System.out.println(a1.size);
	//System.out.println(a1.cno);
	
}
}