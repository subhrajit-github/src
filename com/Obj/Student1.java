package com.Obj;

public class Student1 {
    String name;
    int age;
    int id;
    public void addStudent(String s,int i,int j) {
    	name=s;
    	age=i;
    	id=j;
    }
    public void display() {
    	System.out.println(name+"\n"+age+"\n"+id);
    }
    public static void main(String [] args) {
    	Student1 s1=new Student1();
    	s1.addStudent("Avyak",30,1);
    	s1.display();
    }
}
