package com.Cons;

public class Rectangle {
     int length;
     int breadth;
     public Rectangle(int length,int breadth) {
    	 this.length=length;
    	 this.breadth=breadth;
     }
     public void RectangleArea() {
    	 System.out.println(length*breadth);
     }
     public void perimeter(){
    	 int res=2*(length+breadth);
    	 System.out.println(res);
     }
     public void display() {
    	 System.out.println("length :"+length);
    	 System.out.println("breadth :"+breadth);
     }
     public static void main(String [] args) {
    	 Rectangle r=new Rectangle(10,20);
    	 r.display();
    	 r.RectangleArea();
    	 r.perimeter();
    	 
     }
}
