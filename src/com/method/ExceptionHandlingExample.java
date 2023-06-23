package com.method;

import java.io.*;


public class ExceptionHandlingExample 
{

	public static void main(String[] args) 
	{
		
		try
		{
			int i=1/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}

}
