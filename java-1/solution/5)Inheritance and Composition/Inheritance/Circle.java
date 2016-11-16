/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Inheritance
********************************************/

public class Circle{
	private double radius = 1.0;
	private String color = "red";

	//Constructors
	public Circle(){}

	public Circle(double radius){
		this.radius = radius;
	}

	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}

	//Methods
	//toString() method to format the attributes from the Circle object
	public String toString(){
		return "\nCircle:\n Radius : " + this.radius + "\n Color: " + this.color;
	}

	//getArea() method calculates and returns the area based on the radius
	public double getArea(){
		return Math.PI*Math.PI*radius;
	}

	//Get Methods
	public double getRadius(){
		return this.radius;
	}

	public String getColor(){
		return this.color;
	}

	//Set Methods
	public void setRadius(double radius){
		this.radius = radius;
	}

	public void setColor(String color){
		this.color = color;
	}
}