import java.util.Arrays;

public class Q5 {
    public static void main(String args[]) {
        int[] arr = {2, 3 , 6, 4, 8, 6, 9};
        System.out.println("Array: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Second Highest number: " + arr[arr.length - 2]);        
    }
}
