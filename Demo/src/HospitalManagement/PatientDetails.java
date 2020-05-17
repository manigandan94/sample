package HospitalManagement;

import java.util.Scanner;

class PatientInfo implements Patient
{
static Scanner s=new Scanner(System.in);
	
	public void person1() 
	{
		String name = "Haroon";
		int age = 26;
		int id = 1001;
		String blood = "B+ve";
		String Disease ="Cough";
		System.out.println("Patient Name :"+name);
		System.out.println("Patient Age :"+age);
		System.out.println("Patient ID :"+id);
		System.out.println("Patient Bloood Group :"+blood);
		System.out.println("Patient Disease :"+Disease);
	}

	
	public void person2() {
		
		String name = "Mani";
		int age = 26;
		int id = 1002;
		String blood = "O-ve";
		String Disease ="Anemesia";
		System.out.println("Patient Name :"+name);
		System.out.println("Patient Age :"+age);
		System.out.println("Patient ID :"+id);
		System.out.println("Patient Bloood Group :"+blood);
		System.out.println("Patient Disease :"+Disease);
		
	}

	
	public void person3() {
		String name = "Vicky";
		int age = 2;
		int id = 1003;
		String blood = "A+ve";
		String Disease ="Sinus";
		System.out.println("Patient Name :"+name);
		System.out.println("Patient Age :"+age);
		System.out.println("Patient ID :"+id);
		System.out.println("Patient Bloood Group :"+blood);
		System.out.println("Patient Disease :"+Disease);
		
	}

	
	public void person4() {
		String name = "Raj";
		int age = 24;
		int id = 1004;
		String blood = "AB+ve";
		String Disease ="Headache";
		System.out.println("Patient Name :"+name);
		System.out.println("Patient Age :"+age);
		System.out.println("Patient ID :"+id);
		System.out.println("Patient Bloood Group :"+blood);
		System.out.println("Patient Disease :"+Disease);
		
	}	 
	private String name;

	
	public String getName(){
        return name;
    }

    public void setName(String newValue){
        name = newValue;
    }
}

public class PatientDetails extends PatientInfo
{
	public static void main(String[] args)
	{
	String p;
	PatientDetails obj = new PatientDetails();
	System.out.println("-------------------------------");
	obj.person1();
	System.out.println("-------------------------------");
	obj.person2();
	System.out.println("-------------------------------");
	obj.person3();
	System.out.println("-------------------------------");
	obj.person4();
	System.out.println("-------------------------------");
	
    System.out.println("Enter the Patient ID :");
    p = s.nextLine();
    int id = Integer.parseInt(p);
   switch(id) 
   {
   case 1001:
	   obj.person1();
	   break;
   case 1002:
	   obj.person2();
	   break;
   case 1003:
	   obj.person3();
	   break;
   case 1004:
	   obj.person4();
	   break;
	   default :
		   System.out.println("There is no patient available for that ID :"+p);   
   }  
   
   obj.setName("Dr.Akila");
  
   
   System.out.println("Doctor Name: " + obj.getName()); 
 
	
	}
	
}
