package aravindh;
import java.util.Scanner;
public class EOM {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a = in.nextInt();
    E_O(a);
    in.close();
}
    static void E_O(int a){
        if(a%2 == 0){
          System.out.println("The number is even");
        }
        else if( a == 0){
            System.out.println("Zero is neither odd nor even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
