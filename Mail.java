package Rahulhome.Encapsulation;

public class Mail {

	private String id;
	private String pwd;

	public Mail(String id,String pwd) {
		this.id=id;
		this.pwd=pwd;
		// TODO Auto-generated constructor stub
	}
	public String getMail()
	{
		return id;
	}
	public String setMail()
	{
		return pwd;
	}
	public static void main(String [] args)
	{
		Mail m1=new Mail("rahulrai4234@gmail.com","Rahul@1405");
		System.out.println(m1.getMail());
	}
	

}
