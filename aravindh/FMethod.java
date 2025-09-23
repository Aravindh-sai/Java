package aravindh;
import java.util.Scanner;
public class FMethod {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int a =in.nextInt();
    int ans = Fact(a);
    System.out.println("The Factorial of the number is " + ans);
    in.close();
}
   static int Fact(int a){
    if (a == 0 || a == 1) {
        return 1;
    }
    return a * Fact(a - 1);
}
}
