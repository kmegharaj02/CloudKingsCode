package com.ControlStatements;

public class ForSearch {
	public static void main(String args[])
	{
		int n[]= {5,10,15,20,25,30,35,40};
		boolean found=false;
		int val=25;
		
		for(int x:n)
		{
			if(x==25)
			{
				found=true;
				break;
			}
		}
		if(found)
		{
			System.out.println("value found "+val);
		}
	
						
			
			
			
	}

}
