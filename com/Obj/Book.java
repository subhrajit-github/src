package com.Obj;
import java.util.Scanner;
public class Book {
String name;
String author;
double price;
public static Book getBook() {
	//Factory Method
	Book b=new Book();
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	b.name=sc.next();
	b.author=sc.next();
	b.price=sc.nextDouble();
	return b;
}
public static void main(String [] args) {
	Book b=getBook();
	System.out.println(b.name+"\n"+b.author+"\n"+b.price);
}
}

