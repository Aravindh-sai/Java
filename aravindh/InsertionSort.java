package aravindh;
import java.util.Scanner;
public class InsertionSort {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr[] = {-13, 45, 0, 11, -9, 99, 34, -1};
    insertion(arr);
    for(int i: arr){
        System.out.print(i+" ");
    }
    in.close();
}
    static void insertion(int [] arr){
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                } else {
                    break;
                }
            }
        }
    }
}
