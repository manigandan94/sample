package Sample;

public class Demo 
{
	int a=1,b=2,c;
public void addition()
{
	c=a+b;
	System.out.println("1.Public Class & Public Method :"+c);
}

static class Demo1 
{
	int a=4,b=2,c;
private void subraction()
{
	c=a-b;
	System.out.println("2.Static Class & Private Method :"+c);
}
}

protected class Demo2 
{ 
	int a=4,b=2,c; 
public void multiply()
{
	c=a*b;
	System.out.println("3.Protected Class & Public Method :"+c);
}
}

static class Demo3 
{ 
	static int a=4,b=2,c; //declaring variable name as static for static method
static void division()
{
	c=a/b;
	System.out.println("4.Static Class & Static Method :"+c);
}
}

private class Demo4
{ 
 int a=4,b=2,c; 
protected void calculation()
{
	c=(a/b)*b;
	System.out.println("5.Private Class & Protected Method :"+c);
}
}

public static void main(String[] args)
{
	Demo d = new Demo(); // object creation for public class
	Demo1 d1 = new Demo1(); // object creation for calling private method
	Demo2 d2 = d.new Demo2(); // object creation for instance method
	//Demo.Demo2 d2 = new Demo.Demo2();
	Demo4 d4 = d.new Demo4(); // object creation for calling instance method
	d.addition();
	d1.subraction();
	d2.multiply();
	Demo3.division(); // For static class object creation is not required
	d4.calculation();

}
}
