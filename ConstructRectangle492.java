import java.util.ArrayList;

public class ConstructRectangle492 {

    public static void main(String[] args){

        int[] ans = constructRectangle(122122);
        System.out.println(ans[1] + "," + ans[0]);

    }

    public static int[] constructRectangle(int area) {
        
        int[] solution = new int[2];
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        divisors.add(1);
        divisors.add(area);
        for(int i=2; i<((area/2)+1); i++){

            if (area%i==0){
                divisors.add(i);
                divisors.add(area/i);
            }

        }
        ArrayList<Integer> diff =  new ArrayList<Integer>();
        
        int ind=0;
        int min = divisors.get(1)-divisors.get(0);
        for(int i=2; i<divisors.size(); i+=2){
            int check = divisors.get(i+1)-divisors.get(i);
            if(check<min) {
                min = check;
                ind = i;
                }
            }
        solution[0] = divisors.get(ind+1);
        solution[1] = divisors.get(ind);

        return solution;


        }



}
