/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Polymorphism
********************************************/

public class Rectangle extends Shape{
	private double width;
	private double length;

	//Constructors
	public Rectangle(){}

	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled){
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	//Methods
	//getArea()
	public double getArea(){
		return width*length;
	}

	//getPerimeter()
	public double getPerimeter(){
		return 2*(width+length);
	}

	//toString()
	public String toString(){
		String rectangleStr = "\nRectangle:\n\tWidth: " + this.getWidth() + "\n\tLength: " + this.getLength() + "\n\tColor: " + this.getColor() + "\n\tIs Filled? ";
		rectangleStr += (this.isFilled()) ? "Yes.":"No.";
		return rectangleStr;
	}

	//Get Methods
	public double getWidth(){
		return this.width;
	}

	public double getLength(){
		return this.length;
	}

	//Set Methods
	public void setWidth(double width){
		this.width = width;
	}

	public void setLength(double length){
		this.length = length;
	}
}