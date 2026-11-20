package controlstatements;

public class elseifladder {
	
	public static void main(String[]args) {
		
		int age=0;
		if(age>1 && age<18) {
			System.out.println("minor");
		}
		else if(age>=18 && age<60)
		{
			System.out.println("major");
		}
		else if(age>60)
		{
			System.out.println("you are retrired");
		}
		else {
			System.out.println("invalid data");
		}
	}

}
