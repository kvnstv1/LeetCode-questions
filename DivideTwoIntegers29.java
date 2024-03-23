import java.lang.Math;

public class DivideTwoIntegers29{

    public static void main(String[]args){

        System.out.println(divide(-2147483648,1));

    }

    public static int divide(int dividend, int divisor){

        int quotient = 0;
        boolean neg = false;


        if(divisor<0 || dividend<0) neg=true;
        if(divisor<0 && dividend<0) neg = false;
        divisor = Math.abs(divisor);
        dividend = Math.abs(dividend);
        //System.out.println(dividend);
        
        if(dividend<-2147483647){
            dividend = 2147483647;
        }

        if(dividend>2147483647){
            dividend = 2147483647;
        }

        if(dividend<divisor){
            return 0;
        }
        if(divisor ==1){
            if (neg){
                return -dividend;
            }
            else return dividend;
        }
        if(divisor == dividend){
            if(neg) return -1;
            else return 1;
        }
        int temp = divisor;
        while(divisor<dividend){
            divisor += temp;
            quotient++;
        }
        
        if(quotient>=2147483647){
            if(neg) return -2147483647;
            else return 2147483647;
        }
        else if(quotient<=-2147483647){
            if(neg) return -2147483647;
            else return 2147483647;
        }
        else if(neg){
            return -quotient;
        }
        else return quotient;
    }
}