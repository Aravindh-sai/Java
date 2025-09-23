package aravindh;
import java.util.Scanner;
public class Vote {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the age: ");
    int a = in.nextInt();
    Evote(a);
    in.close();
}
    static void Evote(int a){
        if(a>= 18){
            System.out.println("you are eligible to vote");
        }
        else{
            System.out.println("you are not eligible to vote");
        }
    }
}
