package com.ControlStatements;

public class ForEach {
	public static void main(String args[])
	{
		int n[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i:n) {
			System.out.println(i);
			if(i>1)
				//System.out.println("a");
				break;
			sum=sum+i;
	}
		System.out.println(sum);
	}

}
