/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Collections
	Description: Practice for Collections
********************************************/

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class RandomOrder{
	public static void main(String[] args) {
		List<String> arguments = Arrays.asList(args);			//Stores the arguments inside a List using asList() method from Arrays class
		Collections.shuffle(arguments);							//shuffle() method gives a random new order to the elements inside a collection

		arguments.stream().forEach(e->System.out.println(e));	//Stream method to print each argument

		for(String arg : arguments){
			System.out.println(arg);							//for each method to print each argument
		}
	}
}