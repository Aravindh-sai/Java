package aravindh;

import java.util.Scanner;

public class FindingInMountain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,3,5,6,8,10,9,7,4,2};
        int target = 8;
        if(arr[peak(arr)] == target){
            System.out.println(peak(arr));
        }else if(arr[peak(arr)] < target){
            System.out.println(dobinarysearch(arr, target));
        }
        else{
            System.out.println(aobinarysearch(arr, target));
        }
        in.close();
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int aobinarysearch(int[] arr, int target) {
        int start = 0;
        int end = peak(arr) -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }

    static int dobinarysearch(int[] arr, int target) {
        int start = peak(arr)+1;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else if (arr[mid] > target) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
