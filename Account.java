package Rahulhome.Encapsulation;

public class Account {
	private long acno;
	private double bal;
	
	public Account(long acno,double bal) {
		this.acno=acno;
		this.bal=bal;
	}
	public long getacno()
	{
		return acno;
	}
	public double getbal()
	{
		return bal;
	}
	public double setbal(double bal)
	{
			this.bal=bal;
			return bal;
	}
	public void print() {
		System.out.println(acno);
		System.out.println(bal);
	}
}
