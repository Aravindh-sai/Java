package aravindh;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr [] = {-13, 45, 0, 11, -9, 99, 34, -1};
        selection(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }
        in.close();
    }
        static void selection(int [] arr){
           for(int i=0; i<arr.length-1;i++){
           int minIndex = i;
            for(int j=i+1; j< arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex]= arr[i];
            arr[i]= temp;   
           } 
        }
    }