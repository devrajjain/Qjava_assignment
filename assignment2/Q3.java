import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String args[]) {
        int index = 0;
        
        List<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("England");
        countries.add("Nepal");
        countries.add("Sri Lanka");
        System.out.println("ArrayList: " + countries);
        System.out.println("Using for loop:");
        for(int i = 0; i < countries.size(); i++)
            System.out.println("\t" + countries.get(i));
   
        System.out.println("\n Using while loop:");
        while(index < countries.size()) {
            System.out.println("\t" + countries.get(index));
            index++;
        }
        
        System.out.println("\n Using advance for loop:");
        for(String country : countries)
            System.out.println("\t" + country);
        
    }
}
