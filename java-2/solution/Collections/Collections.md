#COLLECTIONS

## 1.-Provides a clean syntax for looping over the elements of a Set, List, array, or other collection<br/>
Set<Double> grades = new HashSet<Double>();<br/>

    Iterator iterator = grades.iterator(); 
      
    while(iterator.hasNext()){
        System.out.println("Value: " + iterator.next() + " ");  
    }

## 2.-Set and Ordering. Define the way how the HashSet, TreeSet and LinkedHashSet collections handle the next elements:<br/>
Set<String> names = new …<String>();<br/>
names.add("Jake");<br/>
names.add("Robert");<br/>
names.add("Marisa");<br/>
names.add("Kasey");<br/>
System.out.println(names);<br/>

A HashSet will not mantain an specific order,
A TreeSet will mantain a sorting order,
And a LinkedHashSet will mantain an insertion order.


## 3.-Write a program that prints its arguments in random order. Do not make a copy of the argument array. Demonstrate how to print out the elements using both streams and the traditional enhanced for statement. <br/>