import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int side = arr.size();
        int d1 = 0;
        int d2 = 0;
        for(int i=0; i<side; i++){
            
              
            d1 += arr.get(i).get(i);
            System.out.println(arr.get(i).get(i));
            d2 += arr.get(i).get(side-(i+1));
            System.out.println(arr.get(i).get(side-(i+1)));
                
            }
        
        int diff = Math.abs(d1-d2);
        
        return diff;
}



    public static void main(String[] args) throws IOException {
        
        List<List<Integer>> i = new ArrayList<List<Integer>>();
        i.add(List.of(11,2,4));
        i.add(List.of(4,5,6));
        i.add(List.of(10,8,-12));

        int val = diagonalDifference(i);

        System.out.println(val);
    }
}