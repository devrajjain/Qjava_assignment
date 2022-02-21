import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        SortedSet<String> s = new TreeSet<>((a, b) -> {
            int insensitive = String.CASE_INSENSITIVE_ORDER.compare(a, b);
            return insensitive==0 ? a.compareTo(b) : insensitive;
        });
        for (String a : args)
            s.add(a);
        System.out.println(s.size() + " distinct words: " + s);
    }
}
