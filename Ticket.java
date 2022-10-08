package Rahulhome;

public class Ticket {
	int tno;
	String mname;
	double price;
	int scount;

	
	public Ticket(int tno,String mname,double price,int scount)
	{
		this.tno=tno;
		this.mname=mname;
		this.price=price;
		this.scount=scount;
	}
		public void print()
		{
			System.out.println(tno);
			System.out.println(mname);
			System.out.println(price);
			System.out.println(scount);
		}
			public static void main(String[] args)
			{
				Ticket T1=new Ticket(01,"PK",350.00,120);
				T1.print();
			}

}
