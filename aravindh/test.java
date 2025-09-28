package aravindh;
import java.util.*;
public class test {

    static int primes(int a ,int b){
        boolean isPrime = true;
        int count = 0;
        for(int i = a; i <= b; i++){
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
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int primeCount = primes(a, b);
        System.out.println(primeCount);
        scanner.close();
    }
}
