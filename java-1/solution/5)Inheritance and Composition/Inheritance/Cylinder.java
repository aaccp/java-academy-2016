/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Inheritance
********************************************/

public class Cylinder extends Circle{
	private double height = 1.0;

	//Constructors
	public Cylinder(){
		super();
	}

	public Cylinder(double radius){
		super(radius);
	}

	public Cylinder(double radius, double height){
		super(radius);
		this.height = height;
	}

	public Cylinder(double radius, double height, String color){
		super(radius, color);
		this.height = height;
	}

	//Methods
	//getVolume() method calculates and returns the volumeof the Cylinder
	public double getVolume(){
		return this.getArea() * this.height;
	}

	@Override
	//toString() method to format the data from the Cylinder object
	public String toString(){
		return "\nCylinder:\n Radius : " + this.getRadius() + "\n Color: " + this.getColor();
	}

	//Get Methods
	public double getHeight(){
		return this.height;
	}

	//Set Methods
	public void setHeight(double height){
		this.height = height;
	}
}