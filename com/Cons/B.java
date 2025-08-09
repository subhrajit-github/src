package com.Cons;

public class B {
  int i;
  int j;
  int k;
  B(int i,int j,int k){
	  this.i=i;
	  this.j=j;
	  this.k=k;
  }
  public static void main(String [] args) {
	  B b=new B(10,20,30);
	  System.out.println(b.i+"\t"+b.j+"\t"+b.k);
  }
}
