package com.ControlStatements;

public class Menu {
	public static void main(String args[])
	throws java.io.IOException
	{
	int choice;
	do {
		System.out.println("help on");
		System.out.println("option 1");
		System.out.println("option 3");
		System.out.println("option 4");
		System.out.println("option 5");
		System.out.println("choose one");
		choice=(char)System.in.read();
	}while(choice <1||choice >5);
	
	switch (choice) {
	case 1:
		System.out.println("one");
		break;
	case 2:
		System.out.println("two");
		break;
	case 3:
		System.out.println("three");
		break;
	case 4:
		System.out.println("four");
		break;
		default:
			System.out.println("five");
			break;
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
