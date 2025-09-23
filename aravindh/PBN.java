package aravindh;
import java.util.Scanner;
public class PBN {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter two number: ");
    int a = in.nextInt();
    int b = in.nextInt();
    Primes(a,b);
    in.close();
}
    static void Primes(int a , int b){
    for (int i = a; i <= b; i++) {
        if (i <= 1) continue;
        
        boolean isPrime = true;
        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        
        if (isPrime) {
            System.out.print(i + " ");
        }
    }
}
}

 
