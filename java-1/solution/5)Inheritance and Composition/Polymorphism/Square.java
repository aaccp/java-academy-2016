/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Polymorphism
********************************************/

public class Square extends Rectangle{
	//Constructors
	public Square(){}

	public Square(double side){
		super(side,side);
	}

	public Square(double side, String color, boolean filled){
		super(side,side,color,filled);
	}

	//Methods
	@Override
	//setWidth() new definition for method declared on Rectangle class
	public void setWidth(double side){
		super.setWidth(side);
		super.setLength(side);
	}

	@Override
	//setLength() new definition for method declared on Rectangle class
	public void setLength(double side){
		super.setWidth(side);
		super.setLength(side);
	}

	@Override
	//toString()
	public String toString(){
		String squareStr = "\nSquare:\n\tSide: " + this.getSide() + "\n\tColor: " + this.getColor() + "\n\tIs Filled? ";
		squareStr += (this.isFilled()) ? "Yes.":"No.";
		return squareStr;
	}

	//Get Method
	public double getSide(){
		return this.getWidth();
	}

	//Set Method
	public void setSide(double side){
		this.setWidth(side);
		this.setLength(side);
	}
}