package aravindh;
import java.util.Scanner;
public class LMethod {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter three numbers: ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    max(a , b, c);
    min(a,b,c);
    in.close();
}
    static void max(int a , int b, int c){
        int max = a;
        if(b> max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.printf("The maximum of the three numbers are: %d",max);
        System.out.println();
    }
     static void min(int a , int b, int c){
        int min = a;
        if(b< min){
            min = b;
        }
        if(c<min){
            min = c;
        }
        System.out.printf("The maximum of the three numbers are: %d",min);
    }
}
