package oopsconcept;
class Encap
{
	private String name;
	private String designation;//rightclick source and take getter and setter method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Encap e=new Encap();
		e.setName("Athira");
		e.setDesignation("Tester");
		System.out.println(e.getName());
		System.out.println(e.getDesignation());
		

	}

}
