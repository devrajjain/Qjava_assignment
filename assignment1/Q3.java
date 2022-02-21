import java.util.List;
import java.util.ArrayList;


public class Q3 {
    
    public static List<String> trimStrings(List<String> myList) {
        for (int i = 0; i < myList.size(); i++)
            myList.set(i, myList.get(i).trim());
        return myList;
    }
    
    public static void main(String args[]) {
        List<String> myList = new ArrayList<>();
        myList.add(" hello    ");
        myList.add("  world    ");
        System.out.println(Q3.trimStrings(myList));
    }
}
