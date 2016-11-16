/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Composition
********************************************/

public class Author{
	private String name;
	private String email;
	private char gender;

	//Constructor
	public Author(String name, String email, char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	//Get methods
	public String getName(){
		return this.name;
	}

	public String getEmail(){
		return this.email;
	}

	public char getGender(){
		return this.gender;
	}

	//Set methods
	public void getName(String name){
		this.name = name;
	}

	public void getEmail(String email){
		this.email = email;
	}

	public void getGender(char gender){
		this.gender = gender;
	}
}