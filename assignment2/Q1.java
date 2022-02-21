import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Map.Entry;

public class Q1 {
    public static void main(String[] args) {
        int temp;
        Map<Integer, String> countries = new HashMap<>();
        countries.put(1, "India");
        countries.put(2, "USA");
        countries.put(3, "England");
        countries.put(4, "Nepal");
        countries.put(5, "Sri Lanka");
        System.out.println("Using advance for loop:");
	for (Map.Entry<Integer, String> set : countries.entrySet())
            System.out.println("\t" + set.getKey() + " => " + set.getValue());
        
        temp = countries.size();
        System.out.println("\n \n Using while loop:");
        Iterator<Entry<Integer, String> > myIterator = countries.entrySet().iterator();
 
        while (myIterator.hasNext()) {
            Map.Entry<Integer, String> myMap = (Map.Entry<Integer, String>)
            myIterator.next();
            System.out.println("\t" + myMap.getKey() + " => " + myMap.getValue());
        }

    }
}
