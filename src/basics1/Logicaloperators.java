package basics1;

public class Logicaloperators {

	public static void main(String[] args) {
	/* A  B   A&&B  A||B  !A
	 	1  1    1     1    0
	 	1   0    0    1    0
	 	0    1    0    1    1
	 	0     0    0    0    1 */
		String username="abc";
		String password="abcde";
		System.out.println(username=="abc" && password=="abcde");
		System.out.println(username=="abc" || password=="ab");
		System.out.println(!(username=="abc"));
	}

}
