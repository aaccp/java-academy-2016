/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for composition
********************************************/

public class TestBook{
	public static void main(String[] args) {
		Author auth = new Author("V. C. Andrews", "vcandrews@books.com", 'F');		//Creation of objects to be used on test
		Book book1 = new Book("Flowers in the Attic", auth, 15.95);
		Book book2 = new Book("Petals on the Wind", auth, 16.23, 5);

		System.out.println(book1.toString());										//Calling toString() method to test objects creation
		System.out.println(book2.toString());

		System.out.println("\n\nBook No. 1: " + book1.getName());					//Testing getName() method on Book object

		Book book3 = new Book("If There Be Thorns", book2.getAuthor(), 0.0, 8);		//Testing getAuthor() method on Book object
		System.out.println("\nNew book available: ");
		System.out.print(book3.toString());

		book3.setPrice(17.32);														//Testing setPrice() method on Book object
		System.out.println("\nPrice corrected:\n\tPrice: " + book3.getPrice());		//Testing getPrice() method on Book object

		System.out.println("\nNew books on storage");
		book1.setQty(book1.getQty()+3);												//Testing both set and get methods for Qty on Book object

		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
	}
}