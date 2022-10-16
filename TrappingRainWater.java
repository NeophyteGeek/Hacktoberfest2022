package array;
import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] height = new int[size];
        for (int i = 0; i < size; i++) {
            height[i] = sc.nextInt();
        }
        int area = trap(height);
        System.out.println("The maximum water that can be stored is:" + area);
    }
    public static int trap(int[] heights) {
        int flag =0;
        int depth = 0,height =0,length=0,area,totalArea=0,sum=0;
        for (int i = 0; i < heights.length-1; i++) {
            if(flag == 0) {
                if (heights[i + 1] < heights[i]) {
                    flag = 1;
//                    depth += (heights[i] - heights[i+1]);
                    sum += heights[i+1];
                    length++;
                }
            } else if(flag == 1) {
                if(heights[i+1] > heights[i]) {
                    flag = 2;
//                    height += (heights[i+1] - heights[i]);
                    sum += heights[i+1];
                    length++;

                } else if(heights[i + 1] < heights[i]) {
//                    depth += (heights[i] - heights[i+1]);
                    sum += heights[i+1];
                    length++;

                } else {
                    sum += heights[i+1];
                    length++;
                }
            } else if (flag == 2) {
                if(heights[i + 1] < heights[i]) {
                    flag = 0;
                    area = Math.min(depth,length) * (length-1);
                    area = area - sum;
                    totalArea += area;
                    area = 0;sum = 0;
                } else if (heights[i+1] > heights[i]) {
                    height += (heights[i+1] - heights[i]);
                    length++;
                } else{
                    length++;
                }
            }
        }
        return height;
    }
}
