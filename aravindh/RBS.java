package aravindh;
import java.util.Scanner;
public class RBS {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = {4,5,6,7,0,1,2};
    int target = 2;
    int start =0;
    int end =arr.length-1;
    int p = pivot(arr);
    System.out.println(ans(arr, p, target, start, end));
    in.close();
}
    static int ans(int[] arr , int p , int target, int start , int end){
        if(p == -1){
            aobinarysearch(arr, target , start ,end);
        }
        if(arr[p] == target){
            return p;
        }
        else if(arr[start] < target){
            end = p -1; 
        }else{
            start = p +1;
        }
        return aobinarysearch(arr, target, start, end);
    }
    static int pivot(int[] arr){
        int start =0;
        int end =arr.length-1;
        while( start <= end){
            int mid = start + (end-start)/2;
            if( mid != end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
     static int aobinarysearch(int[] arr, int target, int start, int end){
      
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
    // RBS with duplicate values
    
}
