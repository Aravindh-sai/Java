package aravindh;
import java.util.Scanner;
public class BubbleSort {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr [] = {-13, 45, 0, 11, -9, 99, 34, -1};
    bubble(arr);
    for(int i: arr){
        System.out.print(i+" ");
    }
    in.close();
}
    static void bubble(int [] arr){
        boolean swapped;
       for(int i=0; i<arr.length-1;i++){
        swapped = false;
        for(int j=1; j< arr.length-i;j++){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                swapped = true;
            }
        }
        if(!swapped) break;
       } 
    }
}
