package Rahulhome;

public class SimNo {
	long simno;
	String sprovider;
	double bal;
	public SimNo(long simno) {
		this.simno=simno;
	}
	public SimNo(long simno,String sprovider)
	{
		this(simno);
		this.sprovider=sprovider;
	}
	public SimNo(long simno,String sprovider,double bal)
	{
		this(simno,sprovider);
		this.bal=bal;
	}
	public void print()
	{
		System.out.println(simno);
		System.out.println(sprovider);
		System.out.println(bal);
		System.out.println("======================");
	}

}
