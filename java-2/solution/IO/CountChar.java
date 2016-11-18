/*******************************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: IO
	Description: Practice for Read Stream
********************************************/

import java.io.*;

public class CountChar{
	public static void main(String[] args) {
		FileReader fr = null;					//Initializes FileReader null to use on try block
		int count = 0;
		char test = args[0].charAt(0);			//Uses console arguments to set variable

		try{
			int aux;
			fr = new FileReader("test.txt");	//Asignes a new FileReader to our FileReader variable
			while((aux = fr.read()) != -1){		//Reads the file one char at the time
				if((char)aux == test)
					count++;					//Increases count if the char is equal to the one declared by the args
			}
		}

		catch(IOException e){}					//Catches exception

		finally{
			try{
				fr.close();						//Always tries to close file
			}
			catch(IOException e){}				//Catches exception
			System.out.println("Character '" + test + "' was found: " + count + " times.");
		}
	}
}