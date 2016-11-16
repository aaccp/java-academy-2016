/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Composition
********************************************/

public class Book{
	private String name;
	private Author author;
	private double price;
	private int qty = 0;

	//Constructors
	public Book(String name, Author author, double price){
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author author, double price, int qty){
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	//Methods
	//toString() method to format the data from the Book object
	public String toString(){
		String authorStr = "\n\tName: " + this.author.getName() + "\n\tEmail: " + this.author.getEmail() + "\n\tGender: " + this.author.getGender();
		String s = "\nName: " + this.name + "\nAuthor: " + authorStr + "\nPrice: " + this.price + "\nQuantity: " + this.qty;
		return s;
	}

	//Get methods
	public String getName(){
		return this.name;
	}
	
	public Author getAuthor(){
		return this.author;
	}
	
	public double getPrice(){
		return this.price;
	}
	
	public int getQty(){
		return this.qty;
	}

	//Set Methods
	public void setPrice(double price){
		this.price = price;
	}

	public void setQty(int qty){
		this.qty = qty;
	}
}