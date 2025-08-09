package com.CalltoThis;

public class Emp {
     String name;
     int age;
     int id;
     Emp(String name){
    	 this.name=name;
     }
     Emp(String name,int age){
    	 this(name);
    	 this.name=name;
    	 this.age=age;
     }
     Emp(String name,int age,int id){
    	 this(name,age);
    	 this.name=name;
    	 this.age=age;
    	 this.id=id;
     }
     public void display() {
    	 System.out.println("EMP NAME :"+name);
    	 System.out.println("EMP AGE :"+age);
    	 System.out.println("EMP ID :"+id);
     }
    
     public static void main(String [] args) {
    	 Emp e1=new Emp("ram",26,1);
    	 e1.display();
     }
}
