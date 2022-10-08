package Inheritance.inhertancedemo1.Supar;

public class Human {
	String name;
	int age;
	char genter;
	Human(String name,int age, char genter)
	{
		this.name=name;
		this.age=age;
		this.genter=genter;
	}
	public static void main(String[] args) {
		Emoployee e=new Emoployee("Rahul kumar",22,'M',"TTBS103405");
		Emoployee e1=new Emoployee("Pooja Malik",22,'F',"TTBS103408");
		e.Eprint();
		e1.Eprint();
		Student s=new Student("Rahul Kumar",22,'M',77.40,"B.Tech(CSE)");
		Student s1=new Student("Ashutosh Raj",25,'M',75.40,"B.Tech(CSE)");
		s.Sprint();
		s1.Sprint();
	}
}
class Emoployee extends Human{
	String eid;
	Emoployee(String name, int age, char genter,String eid) {
		super(name, age, genter);
		this.eid=eid;
	}
	public void Eprint()
	{
		System.out.println("Emoployee name is:- "+name);
		System.out.println("Emoployee age is:- "+age);
		System.out.println("Emoployee genter is:- "+genter);
		System.out.println("Emoployee id is:- "+eid);
		System.out.println("==================================");
	}
}
class Student extends Human{
	double percentage;
	String qualification;
	Student(String name, int age, char genter,double percentage,String qualification) {
		super(name, age, genter);
		this.percentage=percentage;
		this.qualification=qualification;
	}
	public void Sprint()
	{
		System.out.println("Student name is:- "+name);
		System.out.println("Student age is:- "+age);
		System.out.println("Student genter is:- "+genter);
		System.out.println("Student percentage is:- "+percentage);
		System.out.println("Student qualification is:- "+qualification);
		System.out.println("==================================");
	}
}