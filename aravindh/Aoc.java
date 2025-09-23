package aravindh;
import java.util.Scanner;
public class Aoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r = in.nextInt();
        double area = Math.PI * r * r;
        System.out.printf("The area of the circle with radius %d is %.2f", r, area);
        in.close();
    }
}
