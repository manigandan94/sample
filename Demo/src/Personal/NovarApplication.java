package Personal;

import java.io.IOException;
import java.util.Scanner;

public class NovarApplication extends LoginForm
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws IOException
	{	
		LoginForm ob = new LoginForm();
		ob.template();
		String str = sc.nextLine();
		int i = Integer.parseInt(str);	
		try {
			switch(i)
			{
			case 1:
				ob.firstName();
				ob.lastName();
				ob.birthYear();
				ob.mailId();
				ob.password();
				ob.signup();
				break;
			case 2:
				ob.login();
				break;
			default :
				System.out.println("<<<< Invalid Selection >>>>");
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
