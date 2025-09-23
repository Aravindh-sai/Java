package aravindh;
import java.util.Scanner;
public class LargestLoop {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int max = 0;
       while(true){
            int c = in.nextInt();
            if(max < c){
               max = c;
            }
            else{
                break;
            }
       } 
       System.out.printf("The result is %d",max);
       in.close();
    }
}
