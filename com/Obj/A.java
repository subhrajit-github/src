package com.Obj;

public class A {
    static int i=10;
    int j=20;
    public static void m1() {
    	System.out.println(i);
    	//System.out.println(j);//Compile time error
    	
    }
    public void m2() {
    	System.out.println(i);
    	System.out.println(j);
    }
    public static void main(String [] args) {
    m1();
    new A().m2();
}
}
