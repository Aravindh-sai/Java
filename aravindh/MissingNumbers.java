package aravindh;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MissingNumbers {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int arr[] = {4,3,2,7,8,2,3,1};
    List<Integer> result = missing(arr);
    System.out.println(result);
    in.close();
}
    static List<Integer> missing(int[] arr) {
        cyclicSort(arr);
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(i + 1);
            }
        }
        return ans;
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
