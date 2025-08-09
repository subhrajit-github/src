package com.Block;

public class Test2 {
	{
		System.out.println("Non-Static-Block-1");
	}
	static {
		System.out.println("Static-Block-1");
		new Test2();
	}
	public static void main(String [] args) {
		System.out.println("Main starts");
		{
			System.out.println("Block");	
		}
		System.out.println("Main ends");
	}
	{
		System.out.println("Non-Static-Block-2");
	}
	static {
		System.out.println("Static-Block-2");
	}
}
