package Amazon;

import java.util.Scanner;

public class BuyProduct 
{
	static Scanner input = new Scanner(System.in); 
	public BuyProduct()
	{
		System.out.println("NovarCart Updates available here: Click Here");
		System.out.println("____________________________________________");
		
	}
	private boolean login()
	{
		boolean log = false;
		int i = 0;
        
	    String username;
	    String password;
	    
	    System.out.println("Please enter your Novar crendatails (Username : admin,Password: admin)");
	    System.out.println("Enter your username: ");
	    username = input.next();
	    System.out.println("Enter your password: ");
	    password = input.next();
	   
	    if(username.equals("admin") && password.equals("admin")) 
	    {
	        System.out.println("Welcome to NovarCart");
	        log = true;
	    }
	    else
	    { 
	    	for(i=1;i<=2;i++)
	    	{
	    	    System.out.println("You entered the invalid crendatails"); 
	    		System.out.println("Enter your username: ");
	    	    username = input.next();
	    	    System.out.println("Enter your password: ");
	    	    password = input.next(); 	
	    	    if(username.equals("admin") && password.equals("admin")) 
	    	    {
	    	        System.out.println("Welcome to NovarCart");
	    	        i--;
	    	        //System.out.println("i++"+i);
	    	        log = true;
	    	        break;
	    	    }
	    	}
	    	if(i>=3)
	    	{
	    		//System.out.println("ii"+i);
	    		System.out.println("Login Limit Excedeed.....");
	    		log = false;
	    	}
	 	    }
	    return log;
	    }
	
	public void productSelection()
	{	
		if(login())
		{
		
		System.out.println("Select any one product name below listed :");
		String arr[] = {"Mask","Sanitizer","Veggies","Free Virus"};
		String p1 = arr[0];
		String p2 = arr[1];
		String p3 = arr[2];
		String p4 = arr[3];
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		String p = input.nextLine();
		
		try {
			switch(p)
			{
			case "Mask":
				if(p1.equals("Mask")) 
			    {
			        System.out.println("Mask Cost is : 100");
			        System.out.println("Mask is added to the cart");
			        break;
			    }
			case "Sanitizer":
				if(p2.equals("Sanitizer")) 
			    {
			        System.out.println("Sanitizer Cost is : 200");
			        System.out.println("Sanitizer is added to the cart");
			        break;
			    }
			case "Veggies":
				if(p3.equals("Veggies")) 
			    {
			        System.out.println("Veggies Cost is : 300");
			        System.out.println("Veggies is added to the cart");
			        break;
			    }
			case "Free Virus":
				if(p4.equals("Free Virus")) 
			    {
			        System.out.println("Free Virus Cost is : 0");
			        System.out.println("Free Virus is added to your heart");
			        break;
			    }
			default: 
			    System.out.println("no match : Select again");
			    productSelection();

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Products are not available now ! Please visit later");
		}
		}
		}
	public static void main(String[] args) 
	{
		BuyProduct b = new BuyProduct();
		
		//b.login();
		b.productSelection();
	}

	}

