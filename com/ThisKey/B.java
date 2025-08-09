package com.ThisKey;

public class B {
    int i;
    int j;
    public void m1(int i,int j) {
    	this.i=i;
    	this.j=j;
    }
    public void display(int i,int j) {
    	B b=new B();
    	System.out.println(i+"\t"+j);
    	System.out.println(b.i+"\t"+b.j);
    	System.out.println(this.i+"\t"+this.j);
    }
    public static void main(String [] args) {
    	B b1=new B();
    	b1.m1(10,20);
    	b1.display(100, 200);
    }
}
