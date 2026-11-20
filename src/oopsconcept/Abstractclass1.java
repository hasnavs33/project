package oopsconcept;
abstract class Bankaccount{
	abstract void calculateinterest();
}
class savingaccount extends Bankaccount
{

	@Override
	void calculateinterest() {
		System.out.println("create a  saving account");
	}
}
class currentaccount extends Bankaccount
{

	@Override
	void calculateinterest() {
		System.out.println("create a current account");
	}
	
}


public class Abstractclass1 {

	public static void main(String[] args) {
		savingaccount ob=new savingaccount();
		ob.calculateinterest();
		
		currentaccount c=new currentaccount();
		c.calculateinterest();
		
	}
}



