public class SingleNumber139 {
    
    public static void main(String[] args){

        int[] a = {5,1,2,1,2};
        int b = findSingle(a);
        System.out.println(b);

    }

    public static int findSingle(int[] nums){

        int res = 0;

        for(int i=0; i<nums.length; i++){

            res = res^nums[i];   //Using bitwise XOR operation, we know a^b=0 iff a=b. This leaves only one number left.
        }

        return res;
    }

}
