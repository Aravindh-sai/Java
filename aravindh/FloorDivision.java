package aravindh;
import java.util.Scanner;
public class FloorDivision {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Floor Division: " + (a / b));
        in.close();
    }
}
