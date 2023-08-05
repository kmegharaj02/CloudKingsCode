package com.ControlStatements;

public class ElseIf {

	public static void main(String[] args) {
		int month=1;
		String season;
		if(month ==1||month==2||month==3)
			season="summer";
		else if(month==4||month==5||month==6)
			season="winter";
		else if(month==7||month==8||month==9)
			season="spring";
		else
			season="autumn";
		System.out.println("month is "+season+" season");
		
		// TODO Auto-generated method stub

	}

}
