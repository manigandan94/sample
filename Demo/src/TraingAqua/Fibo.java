package TraingAqua;

public class Fibo 
{
	static int value =0;
	static int count = 10;
	
	public static void main(String[] args)
	{
		int value1 =0,value2=1;
	for(int i=1;i<=count;i++)
	{	
		System.out.println(value1);
		
		int value = value1+value2;//1
		    value1 = value2;//1
		    value2 = value;//1
	}
	
	}
}


