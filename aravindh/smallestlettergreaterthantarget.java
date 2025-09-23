package aravindh;
import java.util.Scanner;
public class smallestlettergreaterthantarget {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char[] arr = {'c', 'f', 'g'};
    char target = 'a';
    System.out.println(ans(arr, target));
    in.close();
}
    static char ans(char[] arr, char target){
        int start= 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start) /2;
           
             if(arr[mid] <= target){
                start = mid+1;
            }
            else {
                end = mid -1;
            }
        }
        return arr[start % arr.length];
}
}
