package aravindh;
import java.util.Scanner;
public class InfiniteArray {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr= {1,3,5,7,8,9,11,13,14,15,19,20,21,24,25};
    int target = 20;
    System.out.println(ans(arr, target));
    in.close();
}
    static int ans(int[] arr, int target){
      int start = 0;
      int end = 1;
      int a =0;
      while(target > arr[end]){
        int temp = end+1;
        end = end + (end -start +1)*2;
        start = temp;
    }
      a= aobinarysearch(arr , target , start ,end) ;
      return a;
    }
    static int aobinarysearch(int[] arr, int target, int start, int end){
        while(start <= end){
           int mid = (start + end)/2;
            if(arr[mid] < target){
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
