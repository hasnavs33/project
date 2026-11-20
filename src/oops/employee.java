package oops;

public class employee {
	int salary;
	int empid;
	String empname;
	String designation;
	
	public void display()
	{
		System.out.println(salary);
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(designation);
	}
	
	public static void main(String[]args)
	{
		employee c=new employee();
		c.salary=10000;
		c.empid=101;
		c.empname="salu";
		c.designation="developer";
		c.display();
		
	}

}
