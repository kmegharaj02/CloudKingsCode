package com.ControlStatements;

public class Switch {
	public static void main(String args[])
	{
		int month=10;
		String season;
		//if(month<=12)
		switch(month)
		{
		case 0:
		case 1:
		case 2:
			season="winter";
			break;
		case 3:
		case 4:
		case 5:
			season="summer";
			break;
		case 6:
		case 7:
		case 8:
			season="spring";
			break;
		default:
			season="autumn";			
			}
		System.out.println("month is"+season+" ");


		
	}
}
