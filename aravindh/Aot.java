package aravindh;
import java.util.Scanner;
public class Aot {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        int b = in.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int h = in.nextInt();
        double area = 0.5 * b *h;
        System.out.printf("The area of the triangle is %.2f",area);
        in.close();
    }
}
