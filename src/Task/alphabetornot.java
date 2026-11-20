package Task;

import java.util.Scanner;

public class alphabetornot {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("enter the String:");
		char s=sc.next().charAt(0);
		if(s>='a'&&s<='z'||s>='A'&&s<='Z')
		{
			
			System.out.println("it is an alphabet");
		}
	System.out.println("it is not an alphabet");
	}

}
