package com.Cons;

public class A1 {
    A1(int i){
    	System.out.println("A().cons"+i);
    }
    public static void main(String [] args) {
    	//new(A1);//Compile time Error
    	new A1(10);
    	A1 a1= new A1(10);
    	//new A(40.5)//Compile time Error
    	new A1(2+3);
    }
}
