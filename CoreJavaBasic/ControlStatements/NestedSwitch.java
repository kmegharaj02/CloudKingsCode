package com.ControlStatements;

public class NestedSwitch {
	public static void main(String args[])
	{
		for (int i=0;i<5;i++)
			switch(i) {
			case 0:
				switch(i) {
				case 1:
					System.out.println("a");
					break;
				case 0:
					System.out.println("b");
					break;
				default:
					System.out.println("default inner");
					break;
				}
				break;
			
				case 1:
					System.out.println(" c");
					break;
					
			}
			}
	}


