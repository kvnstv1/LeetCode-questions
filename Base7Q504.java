import java.lang.StringBuilder;
import java.lang.Math;

public class Base7Q504 {

    public static void main(String[] args){
        System.out.println(convertToBase7(100));
    }


    public static String convertToBase7(int num) {
        StringBuilder rep = new StringBuilder();
        StringBuilder rem = new StringBuilder();
        int dividend = num;
        boolean neg=false;
        if(num<0) neg = true;
        dividend = Math.abs(num);
        num = Math.abs(num);

        while(dividend>=7){

            rem.append(Integer.toString(num%7));   //Storing the integer, reverse later
            dividend = num/7;
            num = num/7;

        }
        if(neg){ rep.append(Integer.toString(-dividend));}
        else {rep.append(Integer.toString(dividend));}
        String remRev = rem.reverse().toString();
        rep.append(remRev);
        return rep.toString();

    }   

    
}