package oopsconcept;
class A1
{
	public void m1()
	{
		int a=10;
		System.out.println(a);
	}
}
class B1 extends A1
{
	public void m1()
	{
		super.m1();//parentclass output
		int a=20;
		System.out.println(a);
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		B1 obj=new B1();
		obj.m1();
	
	}

}
