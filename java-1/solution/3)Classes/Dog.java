/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Classes
********************************************/

public class Dog extends Animal{

	private String breed;

	//Constructor
	public Dog(){}

	public Dog(String name, String color, int age){
		super(name, color, age);
	}

	public Dog(String name, String color, int age, String breed){
		super(name, color, age);
		this.breed = breed;
	}

	//Methods
	public void talk(){
		System.out.println("woof woof!");
	}

	public void move(){
		System.out.println(this.getName() + " is walking!");
	}

	public void move(int steps){
		System.out.println(this.getName() + " walked " + steps + " steps!");
	}

	@Override
	public String toString(){
		String s = "\nDog: ";
		s += super.toString() + "\n\tBreed: " + this.getBreed();
		return s;
	}

	//Get Method
	public String getBreed(){
		return this.breed;
	}

	//Set Method
	public void setBreed(String breed){
		this.breed = breed;
	}
}