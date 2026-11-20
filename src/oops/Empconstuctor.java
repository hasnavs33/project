package oops;
//default constuctor
public class Empconstuctor{
	//define instance variable
	String name;
	String designation;
	int id;
	int salary;
	
	public Empconstuctor()
	{
		name="anu";
		designation="Tester";
		id=100;
		salary=50000;
	}
	public static void main(String[]args)
	{
		Empconstuctor e=new Empconstuctor();
		System.out.println(e.name);
		System.out.println(e.designation);
		System.out.println(e.id);
		System.out.println(e.salary);
	}
	

	}
