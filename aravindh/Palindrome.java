package aravindh;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = in.next();
        int len = word.length();
        boolean isPalindrome = true;
        for (int i = 0, j = len - 1; i < len; i++, j--) {
            if (word.charAt(i) != word.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The String is a Palindrome");
        } else {
            System.out.println("The String is not a Palindrome");
        }
        in.close();
    }

}