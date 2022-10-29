package assignmentDay2;


import java.util.ArrayList;
public class Exercise2 {
public static void main(String[] args) {
        ArrayList<String> arlist= new ArrayList<String>();
        arlist.add("Afrah");
        arlist.add("Anjum");
        arlist.add("Amna");
        arlist.add("Asra");
        arlist.add("Ayesha");
        System.out.println(" array list is: " +  arlist);
        System.out.println("trim the size of the above array: ");
        arlist.trimToSize();
        System.out.println( arlist);
 }
}


