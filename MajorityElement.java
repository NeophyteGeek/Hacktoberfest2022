package array;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        System.out.println("Enter the array elements:");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int majority = majorityElement(arr, size);
        System.out.println("The majority element is: "+ majority);
    }
    //this function return the majority element which is the element that is
    //present more than size/2 times in the array.
    //The first approach that I can think of is that we can count the
    //occurrence of each element. we can use hashSet to help count the numbers.
//    public static int majorityElement(int[] arr, int size) {
//        int ans=0;
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        for(int i=0; i< size; i++) {
//            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
//        }
//        for (Map.Entry<Integer,Integer> entry: hm.entrySet()) {
//            if(entry.getValue() > size/2) {
//                return entry.getKey();
//            }
//        }
//        return -1;
//    }

    //second approach that I can think of is that we can sort the array and then find the middle element.
    //since the majority element is present for more than size/2 times hence it will always be present in the middle
    //position(after sorting). After finding the middle element we simply calculate its occurrence in the array.
//    public static int majorityElement(int[] arr, int size) {
//        if(size == 1) return arr[0];
//        Arrays.sort(arr);
//        int ans = arr[size/2];
//        int count =0;
//        for (int i=0; i<size; i++) {
//            if(arr[i] == ans) count++;
//        }
//        if(count > size/2) return ans;
//        return -1;
//    }

    //third approach is the moore's voting algo. In this we keep a count of repeating elements and their index.
    public static int majorityElement(int[] arr, int size) {
        if(size == 1) return arr[0];
        int ans = 0, count = 1;
        for (int i = 1; i < size; i++) {
            if (arr[i] == arr[ans]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                ans = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == arr[ans]) {
                count++;
            }
        }
        if (count > size / 2) return arr[ans];
        return -1;
    }
}
