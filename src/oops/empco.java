package oops;

public class empco {
	
	
	
	
	String name;
	String designation;
	int id;
	int salary;
	
	public  empco(String name,String designation,int id,int salary)
	{
	this.name=name;
	this.designation=designation;
	this.id=id;
	this.salary=salary;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		empco e=new empco("hasna","QA",1,20000);
		System.out.println(e.name);
		System.out.println(e.designation);
		System.out.println(e.id);
		System.out.println(e.salary);
		

	}

}
