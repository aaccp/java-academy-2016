/**********************************
	Author: Angel Carrillo
	Email: aa.ccp@outlook.com
	Title: Variables and Operators
	Description: The purpose of this exercise is to know how to declare and use variables in Java.
***********************************/

public class Exercise2{
	//Variables Scope
	public int classVariable;			//Class level Scope Variable

	public void myMethod(int n){
		int methodVariable;		//Method level Scope Variable

		for(int loopVariable = 0; loopVariable<n; loopVariable++){
								//Loop level Scope Variable
		}
	}

	public static void main(String[] args) {
		//Primitive Types
		byte byteVariable = 100;			//8-bit integer
		short shortVariable = 1000;			//16-bit integer
		int	intVariable = -10000;			//32-bit integer
		long longVariable = 459396787;		//64-bit integer
		float floatVariable = 383.1425f;	//32-bit decimal
		double doubleVariable = 0.1532235;	//64-bit decimal
		boolean	booleanVariable = false;	//2 posible values "true" or "false"
		char charVariable = 'A';			//16-bit unicode

		//Operators
			//Arithmetic (to do calculations on data)
			int sum = 3 + 5;		//Addition
			int sub = 3 - 5;		//Substraction
			int prod = 3 * 5;		//Product
			double div = 3.0/5.0;	//Division
			int mod = 3%5;			//Modulus 
			int i = 0;
			i++;					//Increment by 1
			int j = 10;
			j--;					//Decrement by 1

			//Assignment
			i = 0;					//(=) assign right value to left variable
			i += 5;					//(+=) increment left variable by right value
			i -= 2;					//(-=) decrement left variable by right value
			i *= 7;					//(*=) multiply left variable by right value, stores on left variable
			i /= 4;					//(/=) divide left variable by right value, stores on left variable
			i %= 3;					//(%=) modulus of left variable divide by right value, stores on left variable
			i <<= 2;				//(<<=) left shift left variable by right value, stores on left variable
			i >>= 2;				//(>>=) right shift left variable by right value, stores on left variable
			i &= 6;					//(&=) bitwise AND left variable and right value, stores on left variable
			i |= 5;					//(\=) bitwise OR left variable and right value, stores on left variable
			i ^= 5;					//(^=) bitwise XOR left variable and right value, stores on left variable
									//final value i = 2

			//Logical (boolean logic)
			boolean logicAND = ((2>1)&&(0<1));		//(&&) verifies the boolean value of left and right and applies an AND operation
			boolean logicOR = ((2>1)||false);		//(||) verifies the boolean value of left and right and applies an OR operation 
			boolean logicNOT = !false;				//(!) reverses the boolean value of the value on right	

			//Relational (to compare data)
			boolean isEqual = (sum==sub);			//(==) is left EQUAL TO right?
			boolean isNotEqual = (sum!=sub);		//(!=) is left NOT EQUAL TO right?
			boolean isGreater = (3>5);				//(>)is left GREATER THAN right?
			boolean isLess = (3<5);					//(<)is left LESS THAN right?
			boolean isGreaterOrEqual = (sum>=sub);	//(>=) is left GREATER THAN OR EQUAL TO right?
			boolean isLessOrEqual = (sum<=sub); 	//is left LESS THAN OR EQUAL TO right?

			//Bitwise (bit by bit operations)
			byte a = 0x2C;			//a= 0010 1100
			byte b = 0x19;			//b= 0001 1001
			int c;
			c = a&b;				//(AND)			c= 0000 1000
			c = a|b;				//(OR)			c= 0011 1101
			c = a^b;				//(XOR)			c= 0011 0101
			c = ~a;					//(Compliment)	c= 1101 0011
			c = b<<2;				//(left shift)	c= 0110 0100
			c = a>>2;				//(right shift)	c= 0000 1011

		//Strings
		String myString = new String("This is a text");
		String yourString = "This is another text";

		//Arrays
		int[] arrayForNumbers = new int[5];		//Creating the array without any value

		arrayForNumbers[0] = 1;					//Asigning values to each index
		arrayForNumbers[1] = 2;					
		arrayForNumbers[2] = 3;					
		arrayForNumbers[3] = 4;					
		arrayForNumbers[4] = 5;	

		int[] someNumbers = {1, 2, 3, 4, 5};	//Creating the array with values
	}
}

