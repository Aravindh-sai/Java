package aravindh;
import java.util.Scanner;
public class Matrices {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[][] matrices = new int[3][3];
    for(int i=0; i< 3; i++){
          for(int j=0; j< 3; i++){
            matrices[i][j] = in.nextInt();
    }
   }
   matrix(matrices);
    in.close();
}
    static void matrix(int[][] matrices){
        int temp =0;
       for(int i=0;i<matrices.length; i++){
        for(int j=0; j<matrices.length/2;j++){
            temp = matrices[j][i];
            matrices[j][i] = matrices[i][j];
            matrices[i][j] = temp;
        }
       }
       for(int i=0; i< 3; i++){
          for(int j=0; j< 3; i++){
            System.out.print(matrices[i][j]);
    }
    System.out.println();
}
    }
}
