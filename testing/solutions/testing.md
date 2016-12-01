#Which one of the following refers to an end to end test?  
c) System test

#Which statement is true? 
c) JUnit is a framework to create unit tests.

#Is it true that the convention in Java is to create a unit test class associated with whatever class you are trying to test? Please elaborate on answer. 

It's true, the convention is to create a class normally on a different package called Test, where the name of the class is related with the name of the class being tested, for example a correct name for a test of a class called Circle.java would be CircleTest.java.

#Is it better to name the test methods according to the number order to keep methods name short and organized? i.e. testMethod1, testMethod2, etc. Please elaborate on answer.

No, it's better to have more elaborate names than indicates what is the method testing, this way it would be easier to identify and report the passed or failed features of the program.

#Talking about the structure of tests, what does the ‘given’ clause establish? 
a) The preconditions for the test.

#The ‘then’ clause can be considered as the asserts section in our code? Please elaborate on answer.

Yes, it will display the expected results for our testing methods where we place the posible results for every test.

#You should test the implementation rather than the behavior of your application? Please elaborate on answer.

No, you should test the behavior by testing the public API for the application by accessing only the public methods inside it to make sure they work as they should.

#Accessing private members of your class while testing is considered sometimes as a good practice as it allows the developer to test deeper in the code? Please elaborate on answer

This is true if the private members are supposed to be used by public methods for example getter methods that have already been stablished, if the private members do not have a public way to acces them then you shouldn't try to access them on your test.

#Which statement is true? 
d) All of above.

#One of the main characteristics of TDD is to write tests even before writing the actual code. Please elaborate on answer.

This is true, the porpuse of TDD is to first have an expected functionality for our application before starting to code the application, after having this expected functionality we can create tests that would prove the correct function of the application. Then we will create code making sure the tests are passed correctly generating ony the code enough to pass the test and not wasting time on code that won't improve the function of the application.


