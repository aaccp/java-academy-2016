/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: IO
	Description: Practice for IO streams
********************************************/

import java.io.*;

public class NewDirectory{
	public static void main(String[] args) {
		File file = new File(args[0]);			//Creates a new File object with name equal to the console input Argument

		try{
			file.mkdir();						//uses the object mkdir() method to create the directory
		}

		catch(SecurityException e){}			//Catches Exception in case of not having permisions for creating
	}
}