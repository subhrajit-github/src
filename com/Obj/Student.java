package com.Obj;

public class Student {
    String name;
    int age;
    int id;
    public void Display() {
    	System.out.println(name+"\n"+age+"\n"+id);
    }
    public static void main(String [] args) {
    	Student s1=new Student();
    	s1.name="TARAK";
    	s1.age=30;
    	s1.id=1;
    	Student s2=new Student();
    	s1.Display();
    	s2.Display();
    	
    }
}
