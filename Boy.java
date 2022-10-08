package Rahulhome.Encapsulation;

public class Boy {
	String name;
	private String GfName;

	public Boy(String name,String GfName) {
		this.name=name;
		this.GfName=GfName;
	}
	public String getgfname()
	{
		return GfName;
	}
	public String setGfName(String GfName)
	{
		this.GfName=GfName;
		return GfName;
	}
	public void print()
	{
		System.out.println(name);
		System.out.println(getgfname());
	}
}
