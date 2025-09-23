package aravindh;
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1>num2){
            System.out.println(num1 + " is the largest number");
        } else if(num2 > num1){
            System.out.println(num2 + " is the largest number");
        }
        else {
            System.out.println("Both numbers are equal");
        }
        in.close();

    
    }
}
