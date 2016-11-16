/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Polymorphism
********************************************/

public abstract class Shape{
	private String color;
	private boolean filled;

	//Constructors
	public Shape(){}

	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}

	//Methods
	//getArea() method to be implement on inherited class
	public abstract double getArea();

	//getPerimeter() method to be implement on inherited class
	public abstract double getPerimeter();

	//toString() method to be implement on inherited class
	public abstract String toString();

	//Get Methods
	public String getColor(){
		return this.color;
	}

	public boolean isFilled(){
		return this.filled;
	}

	//Set Methods
	public void setColor(String color){
		this.color = color;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}
}