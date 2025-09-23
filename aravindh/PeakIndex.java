package aravindh;
import java.util.Scanner;
public class PeakIndex {

public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] arr = {1,3,5,7,8,4,2,0};
    System.out.println(peak(arr));
    in.close();
}
    static int peak(int[] arr){
        int start =0; 
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid] < arr[mid +1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return arr[start];
    }
}
