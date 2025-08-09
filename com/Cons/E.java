package com.Cons;

public class E {
    int i;
    int j;
    E(){
    	
    }
    E(int i,int j){
    	this.i=i;
    	this.j=j;
    }
    E(E a){
    	this.i=a.i;
    	this.j=a.j;
    }
    
    public static void main(String [] args) {
    	E e=new E();
    	E e1=new E(10,20);
    	E e2=new E(e1);
    	System.out.println(e2.i+"\n"+e2.j);
    }
}
