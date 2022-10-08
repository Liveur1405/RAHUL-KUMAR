package Rahulhome;

public class Games {
	String name;
	int pno;
	String gtype;

	public Games(String name,int pno,String gtype) {
		this.name=name;
		this.pno=pno;
		this.gtype=gtype;
	}
	public Games(String name,int pno)
	{
		this.name=name;
		this.pno=pno;
	}
	public Games(String name) {
		this.name=name;
	}
	public void print() {
		System.out.println("Games name:- "+name+" Players count:- "+pno+" Games types:- "+gtype);
		System.out.println("========================================");
		//System.out.println("Players count:- "+pno);
		//System.out.println("Games types:- "+gtype);
	}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
