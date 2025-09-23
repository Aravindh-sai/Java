package aravindh;
import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        System.out.println("The factors of" + n + "are: ");
        for(int i=1 ; i<=n ; i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
        in.close();
    }
    
}
