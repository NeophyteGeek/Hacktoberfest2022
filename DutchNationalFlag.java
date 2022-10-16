//Sort the array having three types of numbers(numbers can be repeated).
//Approach 1: apply any common sorting algorithm like merge sort.
//Approach 2: take three counter to count the numbers and the rewrite the array
//            to sort it. time complexity: O(2n)
//Approach 3: Use the Dutch national flag algorithm to sort the array. We use
//            three variables low,high and mid to sort the array
package array;
public class DutchNationalFlag {
    public static void main(String[] args) {
        int []arr = {2,2,1,0,1,0,2};
        sort(arr);
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }
    public static void sort(int []arr) {
        int n= arr.length;
        int low=0,mid=0,high=n-1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0 -> {
                    swap(arr, mid, low);
                    mid++;
                    low++;
                }
                case 1 -> {
                    mid++;
                }
                case 2 -> {
                    swap(arr, mid, high);
                    high--;
                }
            }
        }
    }
    public static void swap(int []arr, int a, int b) {
        int t= arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
}
