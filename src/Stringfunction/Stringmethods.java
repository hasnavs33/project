package Stringfunction;

public class Stringmethods {

	public static void main(String[] args) {
		String a="lumINAr";
		String b="technolab";
		System.out.println(a.concat(b));
		
		System.out.println(a+1+2);
		System.out.println(1+2+a);
		
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.startsWith("g"));
		System.out.println(a.endsWith("b"));
		
		System.out.println(a.contains("lum"));
		System.out.println(a.replace("lu", "yy"));
		System.out.println(a.charAt(2));
		String q="       helooooo";
		System.out.println(q);
		System.out.println(q.trim());
		
		
		String S6="Abc";
		String S7="abc";
		System.out.println(S6.equals(S7));
		System.out.println(S6.equalsIgnoreCase(S7));
		
		
		String y="Welcome";
		System.out.println(y.substring(3));
		System.out.println(y.substring(0, 4));
		
		String x="welcome to Thrissur";
		String ab[]=x.split(" ");
		for(String d:ab)
		{
			System.out.println(d);
		}
		String h="hello";
		char cd[]=h.toCharArray();
		for(char c:cd)
		{
			System.out.println(c);
		}
	}

}
