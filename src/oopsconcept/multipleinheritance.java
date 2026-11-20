package oopsconcept;
interface bank1
{
	void bankdetails();
	void savingaccount();
}
interface Bank2
{
	void deposit();
	void withdraw();
}
class H implements bank1,Bank2
{

@Override
public void deposit() {
	System.out.println(" Bank deposit");
	
}

@Override
public void withdraw() {
	System.out.println("Bank withdraw");
}

@Override
public void bankdetails() {
	System.out.println("Bankdetails");
}

@Override
public void savingaccount() {
	System.out.println("savingaccount details");
}
}
public class multipleinheritance {

	public static void main(String[] args) {
		H obj=new H();
		obj.bankdetails();
		obj.deposit();
		obj.withdraw();
		obj.savingaccount();
	}
		
	}


