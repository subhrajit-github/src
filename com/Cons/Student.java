package com.Cons;

public class Student {
     String name;
     int age;
     int id;
     Student(){}
     Student(String name){
    	 this.name=name;
     }
     Student(String name,int age){
    	 this.name=name;
    	 this.age=age;
     }
     Student(String name,int age,int id){
    	 this.name=name;
    	 this.age=age;
    	 this.id=id;
     }
     public void display() {
    	 System.out.println("Student name :"+name);
    	 System.out.println("Student age :"+age);
    	 System.out.println("Student id :"+id);
     }
     public static void main(String [] args) {
    	 Student s1=new Student("iris");
    	 s1.display();
    	 Student s2=new Student("etuc",26);
    	 s2.display();
    	 Student s3=new Student("ram",26,1);
    	 s3.display();
     }
}
