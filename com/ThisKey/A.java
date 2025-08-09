package com.ThisKey;

public class A {
    int i;
    int j;
    public void add(int i,int j) {
    	this.i=i;
    	this.j=j;
    }
    public static void main(String [] args) {
    	A a1=new A();
    	a1.add(10,20);
    	System.out.println(a1.i+"\t"+a1.j);
    }
}
