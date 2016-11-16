/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Polymorphism
********************************************/

public class Test{
	public static void main(String[] args) {
		//Testing Circle class
		Circle circle1 = new Circle();									//Using default constructor to create a Circle object
		circle1.setRadius(5.0);											//Testing method from Circle class
		circle1.setFilled(false);										//Testing method from Shape class
		circle1.setColor("Blue");										//Testing method from Shape class
		System.out.println(circle1.toString());							//Showing object attributes				

		Circle circle2 = new Circle(2.5,"Red",true);					//Creating a Circle object with specified attributes
		System.out.println(circle2.toString());							//Showing object attributes	
		System.out.println("\t*Area: " + circle2.getArea());			//Testing inherited abstract methods
		System.out.println("\t*Perimeter: " + circle2.getPerimeter());	//Testing inherited abstract methods

		//Testing Rectangle class
		Rectangle rectangle1 = new Rectangle();							//Using default constructor to create a Rectangle object
		rectangle1.setWidth(1.0);										//Testing method from Rectangle class
		rectangle1.setLength(2.0);										//Testing method from Rectangle class
		System.out.println(rectangle1.toString());						//Showing object attributes	

		Rectangle rectangle2 = new Rectangle(2.0,3.0,"Green", true);		//Creating a Rectangle object with specified attributes
		System.out.println(rectangle2.toString());							//Showing object attributes
		System.out.println("\t*Area: " + rectangle2.getArea());				//Testing inherited abstract methods
		System.out.println("\t*Perimeter: " + rectangle2.getPerimeter());	//Testing inherited abstract methods

		//Testing Square class
		Square square1 = new Square();									//Using default constructor to create a Square object
		square1.setSide(2.0);											//Testing method from Square class
		System.out.println(square1.toString());							//Showing object attributes

		Square square2 = new Square(4.0);								//Creating a Square object with specified attributes
		square2.setColor("Black");										//Testing method from Shape class
		square2.setFilled(true);										//Testing method from Shape class
		System.out.println(square2.toString());							//Showing object attributes	

		Square square3 = new Square(5.0, "Orange", true);				//Creating a Square object with specified attributes
		System.out.println(square3.toString());							//Showing object attributes	
		System.out.println("\t*Area: " + square3.getArea());			//Testing inherited abstract methods
		System.out.println("\t*Perimeter: " + square3.getPerimeter());	//Testing inherited abstract methods


	}
}