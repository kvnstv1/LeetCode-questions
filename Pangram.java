import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Pangram {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
    // Write your code here
        //Prepare character stream
        Stream<Character> letter = s.chars()
                                     .mapToObj(c -> (char)c)
                                     .map(Character::toLowerCase);
        //Make an iterator
        Iterator<Character> letters = letter.iterator();
        
        //Fill alphabet
        HashSet<Character> alphabet = new HashSet<Character>(26);
        for(int i=97; i<(97+26); i++){
            alphabet.add((char)i);
        }
        
        //While loop
        while(letters.hasNext() && alphabet.size()!=0){
            char now = (char)letters.next();
            if(alphabet.contains(now)){
                alphabet.remove(now);
            }
        }
        
        if(alphabet.size() == 0){
            return "pangram";
        }else{
            return "not pangram";
        }
        
    }




    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string below");
        String input = sc.nextLine();
        sc.close();

        pangrams(input);
        
    }
}

