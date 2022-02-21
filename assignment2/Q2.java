import java.util.HashMap;
import java.util.Map;

public class Q2 {
    public static void main(String args[]) {
        int temp = 1;
        String str = "Alice is girl and Bob is boy";
        Map<Integer, String> wordsMap = new HashMap<>();
        String[] words = str.split(" ");
        for(String word : words) {
            wordsMap.put(temp,word);
            temp++;
        }
        
        System.out.println("Words: " + wordsMap);
        System.out.println("Number of words: " + wordsMap.size());
    }
}
