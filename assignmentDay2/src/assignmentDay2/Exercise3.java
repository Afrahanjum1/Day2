package assignmentDay2;

import java.util.*;

public class Exercise3 {


public static void main(String args[]) {
 
   TreeSet<Object> Employee = new TreeSet<Object>();
 
   Employee.add("Afrah");
   Employee.add("Amna");
   Employee.add("Anjum");
   Employee.add("Asra");
   Employee.add("Ayesha");
  
   System.out.println("Tree set:" + Employee);  
   Iterator<Object> it = Employee.descendingIterator();
  
   System.out.println("Elements in Reverse Order:");
   while (it.hasNext()) {
      System.out.println(it.next());
   }
}
}



