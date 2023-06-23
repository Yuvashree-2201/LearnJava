package com.method;

public class Student 
{
	
	int id;
	String name;
	int age;
	
	public Student(int id, String name,int age)
	{
	this.id=id;
	this.name=name;
	this.age=age;
	}

	public static void main(String[] args) 
	{
		Student S1=new Student(110,"Yuva",28);
		Student S2=new Student(112,"Shree",28);
		
		System.out.println(S1.id);
		System.out.println(S1.name);
		System.out.println(S1.age);
		System.out.println(S2.id);
		System.out.println(S2.name);
		System.out.println(S2.age);

	}

}
