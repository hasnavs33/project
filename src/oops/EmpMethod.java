package oops;

public class EmpMethod {

	int empid;
	int salary;
	String designation;
//	public void setvalues(int empid,int salary,String designation)
	{
//		this.empid=empid;
//		this.salary=salary;
//		this.designation=designation;
	}
	public void setvalues(int id,int sal,String desig)
	{
		empid=id;
		salary=sal;
		designation=desig;
	}
	public void display()
	{
		System.out.println("empid="+empid);
		System.out.println("salary="+salary);
		System.out.println("designation="+designation);
		
	}
	public static void main(String[]args) {
		EmpMethod e=new EmpMethod();
		e.setvalues(100,40000,"designer");
		e.display();
	}

}
