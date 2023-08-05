package com.ControlStatements;

public class FindPrime {
	public static void main(String args[])
	{
		int num=9;
		boolean isprime=true;
		for(int i=2;i<num/i;i++)
		{
			if((num%i)==0) {
				isprime=false;
			break;
			}
		}
		if(isprime)
			System.out.println(" is prime num");
		else
			System.out.println("not prime num");
	}
}









