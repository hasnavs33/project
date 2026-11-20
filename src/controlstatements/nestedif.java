package controlstatements;

public class nestedif {
	
	public static void main(String[]args) {
		
		int age=2,weight=5;
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println("eligible");
			}
			else
			{
				System.out.println("ineligible:under weight");
			}
		}
		else
		{
			System.out.println("not eligible");
		}
	}

}
