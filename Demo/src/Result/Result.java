package Result;

import Calculation.Calc;

public class Result {

	public static void main(String[] args) 
	{
		Calc a = new Calc();
		Calc.result();
		
		//a.result();
		
		a.addition(10, 20);
		a.subraction(40, 10);
		a.multiply(10, 3);
		a.division(300, 10);
		
	}

}
