package aravindh;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int P = sc.nextInt();
        boolean isPrime = true;
        int count = 0;
        for(int i = 1; i <= H; i++){
            isPrime = true;
            if(i == 1) {
                isPrime = false;
            } else {
                for(int j = 2; j <= Math.sqrt(i); j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                count++;
            }
        }
        int ans = count / P;
        System.out.println(count);
        System.out.print(ans);
        sc.close();
    }
}