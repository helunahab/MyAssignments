package Assignment;

import java.util.Scanner;

abstract class Shape{
	public static final double pi = 3.14;   
	 double h; double w;
	abstract void  printArea();
	double Area;	
	
	Scanner xyz = new Scanner(System.in);
	}
		
class Rectangle extends Shape{

	@Override
	void printArea() {
		System.out.println("enter h");
		double h = xyz.nextDouble();
		System.out.println("enter w");
		double w = xyz.nextDouble();
		System.out.println("Area of rectangle:" + h*w);
	}
	
	}

 
class Triangle extends Shape{

	@Override
	void printArea() {
		// TODO Auto-generated method stub
		
	}
	
}
class Circle extends Shape{

	@Override
	void printArea() {
		// TODO Auto-generated method stub
		
	}
	
}
		
     
public class Assig11Shapes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle rec = new Rectangle();
		rec.printArea();
	
	}
}


