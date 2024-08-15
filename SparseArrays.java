import java.util.*;

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     */

    public static void main(String[] args){
        List<String> strings = new ArrayList<String>();
        List<String> queries = new ArrayList<String>();

        strings.add("aba");
        strings.add("baba");
        strings.add("aba");
        strings.add("xzxb");

        queries.add("aba");
        queries.add("xzxb");
        queries.add("ab");

        List<Integer> ans = matchingStrings(strings, queries);

        Iterator<Integer> iter = ans.iterator();

        while(iter.hasNext()){
            int a = iter.next();
            System.out.println(a);
        
        }
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
    
    //Make the result array q entries long
    Integer[] ans = new Integer[queries.size()];
    for(int i=0; i<ans.length;i++){
        ans[i] = 0;
    }
    
    //cycle through the queries loop
    int index=0;
    for(String i: queries){
        for(String j:strings){
            if(j.equals(i)){
                ans[index] += 1;
                //System.out.print(i + "," + j + "\n");
                //System.out.println(ans[index]);
            }
        }
        index++;
        //System.out.println("\n\n");
    }// End of nested loop
    ArrayList<Integer> answer = new ArrayList<Integer>();
    Collections.addAll(answer, ans);
    return answer;
    }




}//End of Class

