import java.util.Arrays;

/**A class that transposes a matrix.
 * Written to solve a Leetcode problem
 * @author Kevin Steve Sathyanath
 * @date 12/04/2024
 */

 public class Transpose{

    public static void main(String[] args){
        int[][] send = {{1,2,3},{4,5,6}};
        int[][] receive = transpose(send);
        System.out.println(Arrays.deepToString(receive));



    }

    /**A method that transposes the matrix. */
    public static int[][] transpose(int[][] matrix){
        int[][] res = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                res[i][j] = matrix[j][i];
            }
        }
        return res;
    }


    /**A method to check the longest internal array */
    public static int longest(int[][] matrix){
        int longe = 0;
        for(int i=0;i<matrix.length; i++){
            if(matrix[i].length>longe){
                longe = matrix[i].length;
            }
        }

        return longe;
    }
 }