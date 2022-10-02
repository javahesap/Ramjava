package com.ram.core;

/**
 * Spring bean
 *
 */
public class HelloWorld
{
	private String name;
	private String Som;

	public String getSom() {
		return Som;
	}

	public void setSom(String som) {
		Som = som;
	}

	public void setName(String name)
	{System.out.println("Spring 5 : Hello World! " + name);
		System.out.println("setName(String name) method is called, "+Som);
		this.name = name;
	}

	public void printHello()
	{
		System.out.println("Spring 5 : Hello World! " + name);
		System.out.println("Spring 5 : Hello World! " + Som);
	}
}
