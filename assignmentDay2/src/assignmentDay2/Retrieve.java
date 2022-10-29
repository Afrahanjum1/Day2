package assignmentDay2;


	import java.util.TreeSet;

	public class Retrieve {
	public static void main(String[] args) {

		  TreeSet <Integer> mySet = new TreeSet<Integer>();

		  mySet.add(30);
		  mySet.add(10);
		  mySet.add(20);
		  mySet.add(50);
		  mySet.add(40);

	 System.out.println("Original tree set: "+mySet);
	 System.out.println("Removes the first element: "+mySet.pollFirst());
	 System.out.println("Removes the Last element: "+mySet.pollLast());
	 System.out.println("Tree set after removing first and last element: "+mySet);
	 }    
	}

