# In your own words what is the JVM?

Is the application in charge of running Java code inside any machine.
It takes the Java precompiled code created from the Java compiler and translates it to the corresponding machine code to the OS in which it is running.

# What about JIT? What is it?

(Just In Time) It's a compiler inside the JVM which is responsible for compiling the bytecode from methods when they're called. Usually the JVM has a count on every called method and when this count is big the method compiled code is saved to save time when the JVM starts.

# How can you execute GC?

It normally runs on thebackground of the JVM being called whenever is needed.
However you can start the execution inside your code using the method System.gc()

# What are the downsides of GC?

* If run as a single thread the GC can cause the program to stop while the GC is running
* It may cause problems on the performance of the application 

# In few words what can you say about the heap space?

It's the space in memory where the references to objects are stored, it's usually divided in a Young and Old Generation.

# What about PermGen? How to increase?

It's a Generation inside the memory that allocates mostly classes or objects that will not be deleted even if the GC runs.
It can be increase using the following command: -XX:MaxPermSize=[value]

# How to increase Java heap?

Using the following command: -Xmxn

Where n is a multiple of 1024 that represents the desired space for PermGen, this must be greater than 2MB. Letters K or M can be added to indicate kilo or mega bytes.

# Explain Hotspot Heap structure

The Heap space is divided in to Generations:

* Young: Space of memory dedicated for objects that may be temporary, divided on Eden and to Survivor spaces.

..* Eden: Every object is first stored in here, once full the GC runs.

..* Survivor: When surviving a GC run on Eden objects are transered here, there are to Survivor spaces to swap and defragment the memory inside Survivor.

* Old Generation: Every object that survived an specific number of GC runs will be inmediately stored here where the GC takes more time to run again.


# Give two scenarios where you can get an OutOfMemoryError error

* When the Heap space is completely full
* When the PermGen is completely full

# How can VM technology be beneficial for slow programs? 

Having a VM will a single program to be run on every machine not matter of the OS installed. Besides giving control of GC to the machine allows the user to not worry for the memory management and just focus on the functionality.
