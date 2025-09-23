package aravindh;
import java.util.Scanner;
public class BS {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
    int target = 6;
    System.out.println(orderagnosticBS(arr, target));
    in.close();
}
    static int orderagnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if(start < end){
            return aobinarysearch(arr, target);
        }
        return dobinarysearch(arr, target);
    }
    static int aobinarysearch(int[] arr, int target){
        int start = 0 ;
        int end = arr.length-1;
        while(start <= end){
           int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
        }
        return -1;
    }
    static int dobinarysearch(int[] arr, int target){
        int start = 0 ;
        int end = arr.length-1;
        while(start <= end){
           int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                end = mid -1;
            }
            else if(arr[mid] > target){
                   start = mid+1;
            }
        }
        return -1;
    }
}
