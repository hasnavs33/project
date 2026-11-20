package oopsconcept;
class parent
{
	public void phone()
	{
		System.out.println("nokia");
	}
}
class child extends parent
{
	public void phone()
	{
		super.phone();
		System.out.println("iphone");
	}
}

public class Mehodoverriding2 {

	public static void main(String[] args) {
		child c=new child();
		c.phone();

	}

}
