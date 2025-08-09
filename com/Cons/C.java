package com.Cons;

public class C {
     C(){
    	 System.out.println("A()-cons");
     }
     C(int i){
    	 System.out.println("A(int i)-cons");
     }
     C(int i,int j){
    	 System.out.println("A(int i,int j)-cons");
     }
     public static void main(String [] args) {
    	 new C();
    	 new C(10);
    	 new C(10,20);
     }
}
