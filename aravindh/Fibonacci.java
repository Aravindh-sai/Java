package aravindh;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = in.nextInt();
    int a = 0 , b =1 , temp;
    while(num > 0){
        System.out.print(a+ " ");
        temp = a;
        a = b;
        b = temp +b;
        num--;
    }
    in.close();
}
    
}