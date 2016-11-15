/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Classes
********************************************/

public abstract class Animal{

	private String name;
	public String color;
	private int age;

	public Animal(){}

	public Animal(String name, String color, int age){
		this.name = name;
		this.color = color;
		this.age = age;
	}

	//Methods
	//talk()
	public abstract void talk();

	//move()
	public abstract void move();

	//toString()
	public String toString(){
		String s = "\n\tName: " + this.getName() + "\n\tColor: " + this.getColor() + "\n\tAge: " + this.getAge();
		return s;
	}

	//Get methods
	public String getName(){
		return this.name;
	}

	public String getColor(){
		return this.color;
	}

	public int getAge(){
		return this.age;
	}

	//Set Methods
	public void setName(String name){
		this.name = name;
	}

	public void setColor(String color){
		this.color = color;
	}

	public void setAge(int age){
		this.age = age;
	}
}