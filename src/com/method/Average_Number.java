package com.method;

public class Average_Number {

	public static void main(String[] args) {
		 int i=8;
		 int j=8;
		 
		 Average_Number.Average(i,j);
	}
	
	public static void Average(int a,int b)
	{
		System.out.println((a+b)/2);
		System.out.println((a-b)/2);
		System.out.println((a*b)/2);
		System.out.println((a%b)/2);
	}

}
