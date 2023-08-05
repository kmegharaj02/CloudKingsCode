package com.ControlStatements;

public class MissingBreak {
	public static void main(String args[])
	{int j=1;;
		for(int i=0;i<7;i++)
			switch(i) {
			case 0:
			//case 1:
			//case 2:
				System.out.println("0,1,2");
				break;
			case 3:
			//case 4:
			//case 5:
				System.out.println("3,4,5");
				break;
				default:
					System.out.println("default");
					
	}

}
}