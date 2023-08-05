package com.ControlStatements;

public class NestedIf {
		public static void main(String args[])
		{ int a=2,b=4,c=6;
			if(a<10){
				if(b<a) {
						if(b<c)
					System.out.println("a");
						else
					System.out.println("b");
				}else
					System.out.println("g");
			
				}
				else
			
				System.out.println("d");
		}

}
