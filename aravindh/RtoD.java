package aravindh;
import java.util.Scanner;
public class RtoD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the currency value in rupees: ");
        int rupees = in.nextInt();
        double dollar = (rupees * 0.01221);
        System.out.printf("%d Indian Rupees = %.2f American Dollars\n", rupees, dollar);
        in.close();
    }
}
