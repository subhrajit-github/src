package com.Cons;

public class A2 {
   int i;
   int j;
   A2(int a,int b){
	  i=a;
	  j=b;
   }
   public static void main(String [] args) {
	   //A2 a2=new A2();//Compile time Error
	   A2 a1=new A2(10,20);
	   System.out.println(a1.i+"\t"+a1.j);
	   A2 a2=new A2(30,40);
	   System.out.println(a2.i+"\t"+a2.j);
   }
}
