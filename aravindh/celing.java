package aravindh;
import java.util.Scanner;
public class celing {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = {0,1,4,6,8,9,14,16,19};
    int target = 15;
    System.out.println(floornum(arr, target));
    in.close();
}
    static int celingnum(int[] arr, int target){
        int start= 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start) /2;
             if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
        }
        return arr[start];
        }
        static int floornum(int[] arr, int target){
        int start= 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start) /2;
             if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else if(arr[mid] > target){
                end = mid -1;
            }
        }
        return arr[end];
        }
    }
    

