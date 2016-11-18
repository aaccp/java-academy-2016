/*******************************************
    Author: Angel Carrillo
    Email: aa.ccp@outlook.com
    Title: Exceptions
    Description: Questionaire for Exceptions
********************************************/

#EXCEPTIONS.

## 1.-Can you spot the compile-time error in the following Java program?<br/>

import java.io.*;<br/>
public class test {<br/>
    public static void main(String[] args) {<br/>
        try {<br/>
            FileReader fr = new FileReader("data.txt");<br/>
        }<br/>
        catch(IOException e){}<br/>
        try {<br/>
            fr.close();<br/>
        }<br/>
        catch(IOException e){}<br/>
    }<br/>
}<br/>

Ans) The FileReader is declared inside the try block which will not allow the fr.close() statement to find the variable fr


## 2.-What will be the output of the program?<br/>
try <br/>
{ <br/>
    int x = 0; <br/>
    int y = 5 / x; <br/>
} <br/>
catch (Exception e) <br/>
{<br/>
    System.out.println("Exception"); <br/>
} <br/>
catch (ArithmeticException ae) <br/>
{<br/>
    System.out.println(" Arithmetic Exception"); <br/>
} <br/>
System.out.println("finished");<br/>

C.	Compilation fails.<br/>


## 3.-What will be the output of the program?<br/>
public class MyProgram <br/>
{<br/>
    public static void main(String args[])<br/>
    {<br/>
        try <br/>
        {<br/>
            System.out.print("Hello world ");<br/>
        }<br/>
        finally <br/>
        {<br/>
            System.out.println("Finally executing ");<br/>
        }<br/>
    }<br/>
}<br/>


D.	Hello world Finally executing<br/>