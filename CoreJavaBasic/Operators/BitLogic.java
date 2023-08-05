package com.Operators;

public class BitLogic {
		public static void main(String args[])
		{
			String binary[]= {"0000","0001","0010","0011","0100","0101","0110","0111","1000"};
			int a=3;
			int b=6;
			int c=a&b;
			int d=a|b;
			System.out.println("a is "+binary[c]);
		}
}
