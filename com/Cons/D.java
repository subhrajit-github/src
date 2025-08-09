package com.Cons;

public class D {
   static {
	   System.out.println("Static-Block-1");
   }
   D(){
	   System.out.println("A()-cons");
   }
   {
	   System.out.println("Non-Static-Block-1");  
   }
   public static void main(String [] args) {
	   new D();
   }
   {
	   System.out.println("Non-Static-Block-2");  
   }
}
