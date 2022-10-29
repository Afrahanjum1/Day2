package assignmentDay2;


import java.util.HashMap;

public class CustomObject {

	public static void main(String[] args) {

		HashMap<String, String> student = new HashMap<String, String>();

		student.put("Afrah ", " M.Tech");
		student.put("Amna ", " B.ed");
		student.put("Ayesha ", " B.sc");

		System.out.println("student");

		student.forEach((key, value) -> System.out.println(key + " => " + value));

	}
}



