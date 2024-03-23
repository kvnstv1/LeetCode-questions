import java.util.*;

public class PascalsTriangle118{

    public static void main(String[] args){

        List<List<Integer>> result = generate(30);
        System.out.println(result);

    }

    public static List<List<Integer>> generate(int numRows){

        List<List<Integer>> result = new ArrayList <List<Integer>>();
        ArrayList<Integer> prev = null;

        for(int i=1; i<=numRows; i++){

            ArrayList<Integer> save = new ArrayList<>();

            for(int j=1; j<=i; j++){    //Choosing i=1 is integral. It assures we don;t have indexOutOfBounds exceptions. 
                //System.out.println(j);
                if(j==1 || j ==i){
                    save.add(1);
                }
                else{
                    //System.out.println("j1"+(j-1));
                    //System.out.println("j2"+(j-2));
                    save.add(prev.get(j-1)+prev.get(j-2));  //Core logic. cool that it can be done without recursion.
                }
                //Make sure those 2 statements are outside the brackets. Otherwise we are assinging a half-cmoplete save to prev at each stage.
            }
            prev = save;
            result.add(save);
        }

        return result;

    }

}