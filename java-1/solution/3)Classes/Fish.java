/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Classes
********************************************/

public class Fish extends Animal{
	
	private String type;
	private String location;

	//Constructor
	public Fish(){}

	public Fish(String name, String color, int age){
		super(name, color, age);
	}

	public Fish(String name, String color, int age, String type){
		super(name, color, age);
		this.type = type;
	}

	public Fish(String name, String color, int age, String type, String location){
		super(name, color, age);
		this.type = type;
		this.location = location;
	}

	//Methods
	public void talk(){
		System.out.println("blop blop!");
	}

	public void move(){
		System.out.println(this.getName() + " is swimming!");
	}

	public void move(int meters){
		System.out.println(this.getName() + " swam " + meters + " meters!");
	}

	public void move(int meters, String s){
		System.out.println(this.getName() + " swam " + meters + " meters " + s);
	}

	@Override
	public String toString(){
		String s = "\nFish: ";
		s += super.toString() + "\n\tType: " + this.getType() + "\n\tLocation: " + this.getLocation();
		return s;
	}

	//Get Method
	public String getType(){
		return this.type;
	}

	public String getLocation(){
		return this.location;
	}

	//Set Method
	public void setType(String type){
		this.type = type;
	}

	public void setLocation(String location){
		this.location = location;
	}
}