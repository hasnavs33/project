package oopsconcept;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class chkdexceptn {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {
		FileInputStream f=new FileInputStream("E://Data.xlsx");
		System.out.println("started");
		Thread.sleep(5000);
		System.out.println("stopped");

	}

}
