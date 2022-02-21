import java.util.ArrayList;
import java.util.List;

public class Q6 {
    public static void main(String args[]){
        List<Character> myList = new ArrayList<>();
        String stream = "Devraj jain, Software Developer";
        System.out.println("String: " + stream);
        for (int i = 0; i < stream.length(); i++) {
            char ch = stream.charAt(i);
            if (!(myList.contains(ch)))
                myList.add(ch);
            else {
                System.out.println("First repeated character: " + ch);
                break;
            }
        }
    }
}