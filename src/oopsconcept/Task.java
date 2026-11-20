package oopsconcept;
class Member {
    String name, address;
    int age;
    double salary;

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}

class Worker extends Member {
    String specialization;

}

class Manager extends Member {
    String department;
    
    public static void main(String[] args) {

        Worker w = new Worker();
        w.name = "Rahul";
        w.age = 25;
        w.address = "Thrissur";
        w.salary = 30000;
        w.specialization = "Java";
        System.out.println("specialization: "+w.specialization);

        Manager m = new Manager();
        m.name = "Anu";
        m.age = 35;
        m.address = "Kochi";
        m.salary = 60000;
        m.department = "HR";
        System.out.println("department: "+m.department);

        

        System.out.println("Worker Details");
        w.printDetails();

        System.out.println("\nManager Details");
        m.printDetails();
    }
}






















public class Task {

	public static void main(String[] args) {
		

	}

}
