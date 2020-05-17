package Personal;



import java.io.BufferedWriter;
import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class LoginForm implements SignupForm
{
	static Scanner sc = new Scanner(System.in);
	boolean b = true;
	String path ="C:\\Users\\manigandang\\Desktop\\New folder\\Data.txt";
	public void write(String s) throws IOException
	{
		//FileWriter writer = new FileWriter("C:\\Users\\manigandang\\Desktop\\New folder\\Data.txt");
		File file = new File(path);
		FileWriter fstream = new FileWriter(file, true);
		BufferedWriter out = new BufferedWriter(fstream);
		out.write(s);
		out.write(System.getProperty("line.separator"));
		out.close();

	}
    public LoginForm()
    {
	   System.out.println("---------------------------------------");
	   System.out.println("<<-------- Welcome To NOV@R --------->>");
	   System.out.println("---------------------------------------");
    }
    public void template()
    {
       System.out.println("1. NOV@R Registeration Form");
 	   System.out.println("2. LoginPage");
 	   System.out.println("---------------------------------------");
 	   System.out.println("Make a Selection :");
    }
	public void firstName()
	{
		System.out.println("---------------------------------------");
		System.out.println("-------NOV@R REGISTERATION FORM--------");
		System.out.println("FirstName(15 Letters) :");
		String firstname = sc.nextLine();
		if(firstname.length()<=15)
	    {
	    	System.out.println("****FIRSTNAME ACCEPTED****");
	    	try {
				write(firstname);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    else
	    {
	    	System.out.println("<<<< Enter Less Than 15 Letters >>>>");
	    	firstName();
	    }
		
	}
	public void lastName() 
	{
		System.out.println("----------------------");
		System.out.println("LastName(15 Letters) :");
		String lasttname = sc.nextLine();
		if(lasttname.length()<=15)
	    {
	    	System.out.println("****LASTNAME ACCEPTED****");
	    	try {
				write(lasttname);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    else
	    {
	    	System.out.println("<<<< Enter Less Than 15 Letters >>>>");
	    	lastName();
	    }
		
	}
	public void birthYear() 
	{
		try 
		{
			System.out.println("----------------------");
			System.out.println("Year Of Birth(Eligible: 18yrs) :");
			System.out.println("Year(YYYY) :");
			long year = Integer.parseInt(sc.nextLine());
		    int y = Integer.toString((int) year).length();
		    if(y==4&&(1940<=year)&&(year<=2002))
		    {
		    	int age = (int) (2020-year);
		    	System.out.println("****AGE :"+age+" ELIGIBLE****");
		    	
		    }
		    else
		    {
		    	System.out.println("<<<< Enter Correct Format/Valid Year >>>>");
		    	birthYear();
		    }
		} catch (NumberFormatException e) 
		{
			System.out.println("<<<< Should not be Char >>>>");
			birthYear();
		}	
	}
	
	public void mailId() 
	{
		System.out.println("----------------------");
		System.out.println("MailId(Eg: abc@domain.com) :");
		String mailid = sc.nextLine();
		String regex = "([a-zA-Z0-9]+)@([a-z]+).com";
		if(mailid.matches(regex))
		{
			System.out.println("****EMAIL ID IS VALID****");
			try {
				write(mailid);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("<<<< Invalid Email Id >>>>");
			mailId();
		}
	}
	public void password()
	{
		System.out.println("----------------------");
		System.out.println("Password :");
		String password = sc.nextLine();
		System.out.println("Confirm Password :");
		String confirmpassword = sc.nextLine();
		if(password.equals(confirmpassword))
		{
			System.out.println("****PASSWORD UPDATED SUCCESSFULLY****");
			try {
				write(password);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("<<<< Password does not match >>>>");
			password();
		}
	}
	public void signup() 
	{
		System.out.println("---------------------------------------");
		System.out.println("Form Submitted - Using Registered MailID and Password For Login");
		System.out.println("---------------------------------------");
	}
	
	public void login() throws IOException
	{	
		
		File myObj = new File(path);
	    Scanner myReader = new Scanner(myObj);
		System.out.println("-------------LOGIN PAGE----------------");
		System.out.println("Enter your MailID :");
		String mail = sc.nextLine();
		while (myReader.hasNextLine()) 
	    {
	        String mailid = myReader.nextLine();
	        if(mail.equals(mailid))
			{
	        	System.out.println("Enter your Password :");        	
			}
		}
		String password = sc.nextLine();
		while(myReader.hasNextLine())
		{
			String cpassword = myReader.nextLine();
			System.out.println(cpassword);
				if(password.equals(cpassword))
					{
						System.out.println("Login Successful");
					}	
		}
	      myReader.close();
	}
}
