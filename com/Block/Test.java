package com.Block;

public class Test {
static int i;
int j;
  static {
	  System.out.println("Static-Block-1");
	  i=10;
  }
  public static void main(String [] args) {
	  System.out.println("main starts");
	  System.out.println(i);
	  System.out.println("main ends");
  }
  static {
	  System.out.println("Static-Block-2");
	  i=30;
  }
  static {
	  System.out.println("Static-Block-3");
	  i=20;
}
}
