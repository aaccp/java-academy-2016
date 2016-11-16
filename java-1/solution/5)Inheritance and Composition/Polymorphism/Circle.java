/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Polymorphism
********************************************/

public class Circle extends Shape{
	private double radius;

	//Constructors
	public Circle(){}

	public Circle(double radius){
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled){
		super(color,filled);
		this.radius = radius;
	}

	//Methods
	//getArea() returns the area of a Circle
	public double getArea(){
		return Math.PI*Math.PI*radius;
	}

	//getPerimeter() returns the perimeter of a Circle
	public double getPerimeter(){
		return Math.PI*radius*2;
	}

	//toString() formats the Circle attributes to be showns as a String
	public String toString(){
		String circleStr = "\nCircle:\n\tRadius: " + this.getRadius() + "\n\tColor: " + this.getColor() + "\n\tIs Filled? ";
		circleStr += (this.isFilled()) ? "Yes.":"No.";
		return circleStr;
	}

	//Get Method
	public double getRadius(){
		return this.radius;
	}

	//Set Method
	public void setRadius(double radius){
		this.radius = radius;
	}
}