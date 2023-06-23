package com.method;
import java.util.Arrays; 

public class Anagram_Sentence {
	
	public static void main(String[] args) {
	
	//String declaration
	String x="He Is SleePInG";
	String y="is he sleEpING";
	
	//remove space
	x=x.replace(" ","");	
	y=y.replace(" ","");
	
	//Lowercase
	x=x.toLowerCase();
	y=y.toLowerCase();
	
	//Convert string to character
	char a[]=x.toCharArray();
	char b[]=y.toCharArray();
	
	//sort array
	Arrays.sort(a);
	Arrays.sort(b);
	
	//Equals method
	boolean result=Arrays.equals(a,b);
	
	//Condition check
	if(result==true)
	{
		System.out.println("Given String is an Anagram");
	}
	else
	{
		System.out.println("Given String is not an Anagram");
	}
	
	}

}
