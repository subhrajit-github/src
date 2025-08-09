package com.Block;

public class Test1 {
  int i;
  {
	  System.out.println("Non-Static-Block-1");
	  i=10;
  }
  public static void main(String [] args) {
	  System.out.println("main starts");
	  Test1 t1=new Test1();
	  System.out.println(t1.i);
	  System.out.println("main ends");
  }
  {
	  System.out.println("Non-Static-Block-2");
	  i=20;  
  }
  {
	  System.out.println("Non-Static-Block-3");
	 int i=20;  
  }
}
