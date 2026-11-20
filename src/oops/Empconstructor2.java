package oops;
//parametrized constructor

public class Empconstructor2{
		//define instance variable
		String name;
		String designation;
		int id;
		int salary;
		
		public  Empconstructor2(String name,String designation,int id,int salary)
		{
		this.name=name;
		this.designation=designation;
		this.id=id;
		this.salary=salary;
		}
		public static void main(String[]args)
		{
			Empconstructor2 e=new Empconstructor2("hasna","QA",1,20000);
			System.out.println(e.name);
			System.out.println(e.designation);
			System.out.println(e.id);
			System.out.println(e.salary);
			
		}
		

}






	
	}

}
