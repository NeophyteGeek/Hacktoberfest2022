package array;

public class kcon {
    public static void main(String[] args) {
        int []arr = {1,-2,1};
//        int k=3;
        int max = kadane(arr);
        System.out.println(max);
    }
    public static int kadane(int []arr){
        int csum=0;
        int msum=Integer.MIN_VALUE;
        for (int j : arr) {
            csum = Math.max(j, csum + j);
            msum = Math.max(msum, csum);
        }
        return msum;
    }
}
