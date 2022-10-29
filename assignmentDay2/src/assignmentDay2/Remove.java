package assignmentDay2;


	import java.util.TreeMap; 
	public class Remove {  
	          public static void main(String args[]) {

	  TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();

	  myMap.put(1, "Afrah");
	  myMap.put(2, "Amna");
	  myMap.put(3, "Anjum");
	  myMap.put(4, "Asra");
	  myMap.put(5, "Ayesha");

	  System.out.println("Value before poll: " + myMap);
	  System.out.println("First returned value: " + myMap.pollFirstEntry());
	  System.out.println("Last returned value: " + myMap.pollLastEntry());
	  System.out.println("Entry after left first and last Value: " + myMap);
	 }
	}

