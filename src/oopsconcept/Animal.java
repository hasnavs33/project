package oopsconcept;
//single inheritance
//multiple inheritance

class Dog
{
	public void barking()
	{
		System.out.println("Dog is barking");
	}
}
class cat extends Dog
{
	public void sleeping()
	{
		System.out.println("cat is sleeping");
	}
}
class tiger extends cat
{
	public void roaring()
	{
		System.out.println("tiger is roaring");
	}
}
class lion extends tiger
{
	public void running()
	{
		System.out.println("lion is running");
	}
}

public class Animal {

	public static void main(String[] args) {
		lion l=new lion();
		l.barking();
		l.sleeping();
		l.roaring();
		l.running();
	}

}
