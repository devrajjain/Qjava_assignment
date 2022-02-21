import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Q1 {
    public static void main(String args[]) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        Collections.shuffle(myList);
        System.out.println("Usings Streams: ");
        myList.stream().forEach(n ->{
            System.out.println(n);
        });

        System.out.println("\nUsing Traditional enhanced for loop: ");
        for(int n : myList){
            System.out.println(n);
        }
    }
}
