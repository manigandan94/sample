package Calculation;

public class Const 
{
	int i;
	String s;
	
	public Const(int modle)
	{
		i = modle;
		//System.out.println(i);
	}
public static void main(String[] args)
{
	Const a = new Const(10);
	System.out.println(a.i);
}
}
