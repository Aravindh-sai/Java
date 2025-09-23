package aravindh;
import java.util.Scanner;
public class P_S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int s =0 , p=1;
        while(n>0){
            int rem = n % 10;
            s+= rem;
            p*= rem;
            n/=10;
        }
        int ans = p - s;
        System.out.printf("The Products minus Sum of the number  is %d", ans );
        in.close();
    }
}
