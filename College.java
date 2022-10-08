package Rahulhome;

public class College {
	String cname;
	String pname;
	int dno;

	public College(String cname) {
		this.cname=cname;
	}
	public College(String cname,String pname)
	{
		this(cname);
		this.pname=pname;
	}
	public College(String cname,String pname,int dno)
	{
		this(cname,pname);
		this.dno=dno;
	}
	public void print()
	{
		System.out.println(cname);
		System.out.println(pname);
		System.out.println(dno);
		System.out.println("======================");
	}

}
