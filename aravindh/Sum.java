package aravindh;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int result = 0;
       while(true){
            int c = in.nextInt();
            if(c!=0){
                result+=c;
            }
            else{
                break;
            }
       } 
       System.out.printf("The result is %d",result);
       in.close();
    }
}
