package com.CalltoThis;

public class A {
    A(){
    	System.out.println("A()-cons");
    }
    A(int i){
    	this(100,200);
    	System.out.println("A(int i)-cons :"+i);
    }
    A(int i,int j){
    	this();
    	System.out.println("A(int i,int j)-cons :"+i+","+j);
    }
    public static void main(String [] args) {
    	new A(10);
    }
}
