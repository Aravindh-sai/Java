package aravindh;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println("the factorial is: " + f);
        in.close();
    }
}
