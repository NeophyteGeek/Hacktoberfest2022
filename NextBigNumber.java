package array;

import java.util.Arrays;

public class NextBigNumber {
    public static void main(String[] args) {
        int n = 50765;
        System.out.println("The next biggest number after " + n + " is " + nextBig(n));
    }

    private static int nextBig(int n) {
        int temp = n, size=0;
        while(temp != 0) {
            size ++;
            temp /= 10;
        }
        int[] arr= new int[size];
        int i = size-1;
        temp =n;
        while(temp != 0) {
            int t = temp%10;
            arr[i--] = t;
            temp /= 10;
        }
        i = size-1;
        while(i>0) {
            if(arr[i-1] < arr[i]) break;
            i--;
        }
        i--;
        if(i == -1) return -1;
        int j = size-1;
        while(j < i) {
            if(arr[j] > arr[i]) {
                swap(arr, i, j);
            }
        }
        int left = i+1, right = arr.length - 1;
        while(left < right){
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        int res=0;
        for( i=0;i<arr.length;i++) {
            res=res*10+arr[i];
        }
        return res;
    }
    public static void swap ( int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
