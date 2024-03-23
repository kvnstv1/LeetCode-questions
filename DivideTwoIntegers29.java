import java.lang.Math;

public class DivideTwoIntegers29{

    public static void main(String[]args){

        System.out.println(divide(-7,3));

    }

    public static int divide(int dividend, int divisor){

        int quotient = 0;
        boolean neg = false;

        //Handle negative numbers
        if(divisor<0 || dividend<0) neg=true;
        divisor = Math.abs(divisor);
        dividend = Math.abs(dividend);

        //Edge case
        if(dividend<divisor){
            return 0;
        }

        //Loop to use addition to find quotient
        int hold = divisor;
        while(divisor<dividend){
            divisor += hold;
            quotient++;
        }
        
        if(quotient>2147483647){
            return 2147483647;
        }
        else if(quotient<-2147483647){
            return -2147483647;
        }
        else if(neg){
            return -quotient;
        }
        else return quotient;

    }
}