import java.util.Stack;
import java.util.Scanner;

public class addition{

    public static void main(String[] args){
        
        //Gather input
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first num\n");
        String num1 = s.next();
        System.out.println("Enter second num\n");
        String num2 = s.next();
        s.close();

        //Process numbers into stacks
        Stack<Integer> a = new Stack<Integer>();
        Stack<Integer> b = new Stack<Integer>();
        Stack<Integer> ans = new Stack<Integer>();
        while(num1!=null){
            int c = num1.charAt(0)-'0';
            a.push(c);
            if(num1.length()!=1){
                num1 = num1.substring(1);
            }
            else{
                num1 = null;
            }
        }
        while(num2!=null){
            int c = num2.charAt(0)-'0';
            b.push(c);
            if(num2.length()!=1){
                num2 = num2.substring(1);
            }
            else{
                num2 = null;
            }
        }

        //Use the stacks to do addition
        int carryOver = 0;
        do{
            int c = a.pop() + b.pop() + carryOver;
            //answer = answer + (place*((c%10)+carryOver));
            ans.push(c%10);
            carryOver = c/10;
            //place = place*10;
        }while(!a.empty() && !b.empty());

        //Test stacks to see which one still has anything
        if(!a.empty() && b.empty()){
            do{
                int c = a.pop()+carryOver;
                //answer = answer + (place*((c%10)+carryOver));
                ans.push(c%10);
                carryOver = c/10;
                //place = place*10;
            }while(!a.empty());
    
        }else if(!b.empty() && a.empty()){
            do{
                int c = b.pop()+carryOver;
                //answer = answer + (place*((c%10)+carryOver));
                ans.push(c%10);
                carryOver = c/10;
                //place = place*10;
            }while(!b.empty());
        }

        
        if(carryOver!=0){
            ans.push(carryOver);
        }
        

        //Convert answer back to string
        String res = "";
        while(!ans.empty()){
            res += ans.pop();
        }
        System.out.println(res);
        }

    }

