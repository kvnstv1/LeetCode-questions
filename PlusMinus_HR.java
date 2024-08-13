
import java.util.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class PlusMinus_HR {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        
        double plus = 0;
        double minus = 0;
        double zero = 0;
        //Iterate over the array
        for(Integer i: arr){
            if(i.intValue()>0){
                plus++;
            }
            else if(i.intValue()<0){
                minus++;
            }
            else zero++;
        }// End of for-each loop
        
        int len = arr.size();
        if (len == 0){
            System.out.println("0.000000");
            System.out.println("0.000000");
            System.out.println("0.000000");
        } //End of edge condition where list is empty
        
        DecimalFormat df = new DecimalFormat("0.000000");
        
        double av1=0;
        double av2=0;
        double av3=0;
        
        av1 = plus/len;
        System.out.println(plus);
        av2 = minus/len;
        System.out.println(minus);
        av3 = zero/len;
        System.out.println(zero);

        
        System.out.println(df.format(av1));
        System.out.println(df.format(av2));
        System.out.println(df.format(av3));

    }

    public class Solution{

        public static void main(String[] args){
            
            List<Integer> a = new ArrayList<Integer>();

            a.add(1);
            a.add(2);
            a.add(0);
            a.add(-1);
            a.add(-2);
            a.add(7);

            PlusMinus_HR.plusMinus(a);

        }
        
    }

}
