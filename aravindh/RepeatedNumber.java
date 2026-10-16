package aravindh;
import java.util.Scanner;
public class RepeatedNumber {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr [] = {1,5,5,4,2,6};
    int result = findDuplicate(arr);
    System.out.println(result);
    in.close();
}
    static int findDuplicate(int[] arr) {
        cyclicSort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
