import java.io.*;
import java.util.*;


public class MinMaxSum{

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        
        List<Integer> a = new ArrayList<Integer>(arr);
        Collections.sort(a);

        long min = 0;
        long max = 0;
        long middle = (long)a.get(1) + (long)a.get(2) + (long)a.get(3);

        min = middle + (long)a.get(0);
        System.out.println(a.get(0));
        max = middle + (long)a.get(4);
        System.out.println(a.get(4));


        System.out.println(min + " " + max);
            
    } 


public class Solution {
    public static void main(String[] args) throws IOException {
        
        List<Integer> a = List.of(942381765, 627450398, 954173620, 583762094, 236817490);
        MinMaxSum.miniMaxSum(a);
    }
}
}