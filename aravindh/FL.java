package aravindh;
import java.util.Scanner;
public class FL {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] result = ans(arr, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
        in.close();
    }

    static int[] ans(int[] arr , int target){
        int[] a = {-1, -1};
        
        a[0] = index(arr, target, true);
        a[1] = index(arr, target,false);
        return a;
    }
    static int index(int[] arr, int target , boolean firstindex){
        int ans = -1;
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                start = mid+1;
            }
            else if(arr[mid]> target){
                end = mid -1;
            }
            else{
                ans = mid;
                if(firstindex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }

        }
        return ans;
    }
    
}
