package aravindh;
import java.util.Scanner;
public class Pythagores {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter 3 number: ");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    triplet(a,b,c);
    in.close();
}
    static void triplet(int a,int b,int c){
        if(a == Math.sqrt(Math.pow(b,2) + Math.pow(c,2)) || b == Math.sqrt(Math.pow(c,2) + Math.pow(a,2)) || c == Math.sqrt(Math.pow(b,2) + Math.pow(a,2))){
            System.out.println("The numbers are pythagores triplets");
        }
        else{
            System.out.println("The numbers are not pythagores triplets");
        }
    }
}
