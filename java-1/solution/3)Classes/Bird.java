/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Classes
********************************************/

public class Bird extends Animal{
	
	private String type;

	//Constructor
	public Bird(){}


	public Bird(String name, String color, int age){
		super(name, color, age);
	}

	public Bird(String name, String color, int age, String type){
		super(name, color, age);
		this.type = type;
	}

	//Methods
	public void talk(){
		System.out.println("chirp chirp!");
	}

	public void move(){
		System.out.println(this.getName() + " is flying!");
	}

	public void move(int meters){
		System.out.println(this.getName() + " flew " + meters + " meters!");
	}

	@Override
	public String toString(){
		String s = "\nBird: ";
		s += super.toString() + "\n\tType: " + this.getType();
		return s;
	}

	//Get Method
	public String getType(){
		return this.type;
	}

	//Set Method
	public void setType(String type){
		this.type = type;
	}
}