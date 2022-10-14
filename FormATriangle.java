package array;
import java.util.Arrays;
public class FormATriangle
{
    public static void main(String[] args) {
        int []arr = {2,2,3,4};
        int ans = allTriangles(arr);
        System.out.println(ans);
    }
//    this function return if an array of two elements can be
//    used to create the sides of a triangle.
//    public static boolean allTriangles( int []arr) {
//        int n = arr.length;
//        int []tri = new int[3];
//        for(int i=0; i< n-2; i++){
//            for(int j=i+1; j< n-1; j++) {
//                for(int k=j+1; k<n; k++) {
//                    tri[0]=arr[i];tri[1]=arr[j];tri[2]=arr[k];
//                    if(isTriangle(tri)) {
//                        System.out.println(tri[0]+" "+tri[1]+" "+tri[2]);
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
    public static boolean isTriangle(int a,int b,int c) {
        if( a + b <= c) return false;
        if( b + c <= a) return false;
        if( a + c <= b) return false;
        return true;
    }
    public static int allTriangles(int []nums) {
        Arrays.sort(nums);
        int i=0,j=2,sum = 0 ;

        if(nums.length < 3) return 0;

        while(j < nums.length) {
            if(isTriangle(nums[i], nums[i+1],nums[j])) {
                sum++;
            }
            i++;j++;
        }
        return sum;
    }
}
