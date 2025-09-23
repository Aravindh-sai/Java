package aravindh;
import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String n = in.next();
        int len = n.length();
        int result = 0;
        for(int i=0 ; i<len ; i++){
            int digit = n.charAt(i) - '0';
            result+= (int)Math.pow(digit, len);
        }
        System.out.println(len);
        System.out.printf("The Amstrong number %s is %d", n,result);
        in.close();
    }
}
