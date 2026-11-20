package oopsconcept;
abstract class smartphone
{
	abstract void speed();
	public void call()
	{
		System.out.println("calling feature");
	}
}
class samsung extends smartphone
{

	@Override
	void speed() {
		System.out.println("samsung speed specifications");
		
	}
	
}
class iphone extends smartphone
{

	@Override
	void speed() {
	System.out.println("iphone speed specification");
		
	}
	
}

public class Abstractclass {

	public static void main(String[] args) {
		samsung ob1=new samsung();
		ob1.call();
		ob1.speed();
		iphone ob2=new iphone();
		ob2.call();
		ob2.speed();
	}

}
