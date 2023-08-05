package com.Operators;

public class ShortCircuit {
	public static void main(String[] args)
	{
	    int  a=10;
		int b=20;
		if(a==10&&++b<22) 
			System.out.println(a);
		
		int d=20;
		int num=100;
		if((d!=0)&&(num/d>=5))
		{
			System.out.println(d);
		}
			
		
		
	}

}
