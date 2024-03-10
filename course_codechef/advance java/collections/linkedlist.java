// LinkedList

// Imagine you have a task list that you want to organize in order of priority. You start with a blank piece of paper and write down the first task on your list: "Finish report". 
// This is the starting point of your LinkedList. You then write down the next task on your list: "Call client". 
// You draw an arrow from "Finish report" to "Call client" to indicate that "Call client" comes after "Finish report" in the list. 
// You continue to add tasks to the list in order of priority, drawing arrows to connect the tasks in the list.

// This is similar to how a LinkedList works in Java. Each task in the list is called a node and contains a reference to the next task in the list. 
// The first task in the list is called the head, and the last task is called the tail.

// Here's some important methods of Java LinkedList:

import java.util.*;

class Jailer
{
	public static void main (String[] args)
	{
        LinkedList<String> myList = new LinkedList<String>();
        myList.add("Finish Report");
        myList.addFirst("Call Client");
        myList.addLast("Send Email");
        System.out.println(myList);
        
        String Element = myList.remove();
        System.out.println(Element);
        myList.addFirst("Call Client");
        

        String firstElement = myList.removeFirst();
        System.out.println(firstElement);
        
        
        String lastElement = myList.removeLast();
        
        myList.set(0, "Send Email"); // "Call Client" is replaced with "Send Email"
        
        System.out.println(myList);

	}
}