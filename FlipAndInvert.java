import java.util.Arrays;
/**A class to flip an invert a 2-D array that mimics an image */

public class FlipAndInvert{

    public static void main(String[] args){
        int[][] send = {{1,0,0},{0,1,0},{0,0,1}};
        int[][] receive = flipAndInvert(send);
        System.out.println(Arrays.deepToString(receive));
    }

    //The method that does the flipping and inverting
    public static int[][] flipAndInvert(int[][] image){
        int[][] flipped = image;

        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                flipped[i][j] = image[i][image[i].length-1-j];
                System.out.print(flipped[i][j]);
            }
        }
        return flipped;
    }

}