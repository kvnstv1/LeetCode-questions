

public class BinaryAddition {

    public static void main(String[] args) {
        String a = "1111";
        String b = "1111";
        String res;
        System.out.println(a);
        System.out.println(b);
        if(a.length()>=b.length()){
            res = add(a,b,b.length());
        }
        else {
            res = add(b,a,a.length());
        }
        System.out.println(res);
    }

    public static String add(String a, String b, int shortl){
        int carryOver = 0;

        StringBuilder res = new StringBuilder();
        for(int i=1; i<=shortl; i++){
            int one = Character.digit(a.charAt(a.length()-i),10);
            int two = Character.digit(b.charAt(b.length()-i),10);
            int three = one+two+carryOver;
            if(three==1 || three ==0){
                res.append(three);
                carryOver=0;
                System.out.println("A" + three);
            }
            else if(three==2){
                res.append("0");
                carryOver=1;
                System.out.println("A" + three);
            }
            else {
                res.append("1");
                carryOver = 1;
                System.out.println("A" + three);
            }
        } // End of for loop
        for(int i=shortl+1; i<=a.length(); i++){
            int one = Character.digit(a.charAt(a.length()-i),10);
            int three = one + carryOver;
            if(three==1 || three ==0){
                res.append(three);
                System.out.println("A" + three);
                carryOver=0;
            }
            else if(three==2){
                res.append("0");
                carryOver=1;
                System.out.println("A" + three);
            }
            else {
                res.append("1");
                carryOver = 1;
                System.out.println("A" + three);
            }
        }//End of for-loop
        if(carryOver==1){
            res.append("1");
            System.out.println("A" + "1");
        }

        String result = res.reverse().toString();


        return result;
    }

}
