package Stringfunction;

public class Stringtask {

	public static void main(String[] args) {
	String s="jmeter";
	String s1="performance testing tool";
	System.out.println(s+" "+s1);
	
	String ab="java language is platform independent";
	if(ab.contains("language"))
	{
	System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	String s="selenium webdriver is used for webapplication testing";
	String a[]=s.split("");
	for(String gh:a)
	{
		System.out.println(gh);
		if(gh.contains("webapplication"))
		{
			break;
		
	}
	}
	}
}


