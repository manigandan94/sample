package Sample;

import java.util.Scanner;


public class Occurence 
{
	static Scanner sc = new Scanner(System.in);
  public static void main(String[] args)
  {
		
	  System.out.println("----------------------");
		System.out.println("MailId(Ex : abc@domain.com) :");
		String mailid = sc.nextLine();
		String regex = "([a-zA-Z0-9]+)@([a-z]+).com";
		
		if(mailid.matches(regex))
		{
			System.out.println("pass");
		}
		
  }
}



/*String pattern = "(.*?)@(.*?).com";
Pattern r = Pattern.compile(pattern);
Matcher m = r.matcher(mailid);
while(m.find())
{
System.out.println(m.group(1));*/