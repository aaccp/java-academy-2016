/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Inheritance and Composition
	Description: Practice for Classes
********************************************/

public class AnimalTest{
	public static void main(String[] args){
		//Testing Dog class
		Dog dog1 = new Dog();									//Using default Constructor, this will create an object with default values for each attribute 
		System.out.println(dog1.toString());					//Showing the default values for each attribute
		// dog1.name = "Doggie";								//This line would generate an error if tried to compile, trying to access a private variable
		dog1.setName("Doggie");									//Using a public Get Method, the private variable can be modified
		dog1.color = "Golden";									//Here the attribute color is public so no Get Method is needed to acces the variable
		// dog1.age = 2;										//This line would generate an error if tried to compile, trying to access a private variable
		dog1.setAge(2);
		//dog1.breed = "Golden Retriever";						//This line would generate an error if tried to compile, trying to access a private variable
		dog1.setBreed("Golder Retriever");
		System.out.println(dog1.toString());					//Showing the modified data inside the object

		Dog dog2 = new Dog("Blackie", "Black", 2, "Labrador");	//Using an overloaded constructor that uses an extra argument (String breed) to be implemented
		System.out.println(dog2.toString());					//Showing created object

		dog2.talk();											//talk() method has a different output for each class
		dog2.move();											//move() method will output a different String for each class
		dog2.move(13);											//move(int steps) overloaded method to give different output on each class

		//Testing Bird class
		Bird bird = new Bird("Cookie", "Green", 3, "Parrot");
		System.out.println(bird.toString());

		bird.talk();											//talk() method has a different output for each class
		bird.move();											//move() method will output a different String for each class
		bird.move(3);											//move(int steps) overloaded method to give different output on each class

		//Teting Fish class
		Fish fish1 = new Fish();
		System.out.println(fish1.toString());
		Fish fish2 = new Fish("Dory", "Blue and Yellow", 1, "Surgeon Fish", "Sydney"); //Overloaded Constructor
		System.out.println(fish2.toString());

		fish2.talk();											//talk() method has a different output for each class
		fish2.move(7);											//move(int steps) overloaded method to give different output on each class
	}
}