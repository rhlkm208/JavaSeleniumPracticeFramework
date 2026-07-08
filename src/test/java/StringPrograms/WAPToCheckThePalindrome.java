package StringPrograms;

import java.util.Scanner;

public class WAPToCheckThePalindrome {
    
    // Kept static so it can be called directly from the main method
    public static String palindromeChecker(String str) {
        String rev = "";
        
        // Loop backwards to reverse the string
        for(int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        
        // Check equality ignoring uppercase/lowercase differences
        if(rev.equalsIgnoreCase(str)) {
            System.out.println("It's a Palindrome");
        } else {
            System.out.println("It's not a Palindrome");
        }
        return rev;
    }

    public static void main(String[] args) {
        // Create scanner inside main to accept dynamic console input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string to check: ");
        String inputStr = sc.nextLine();
        
        // Pass the user's input to your method
        palindromeChecker(inputStr);
        
        // Close the scanner resource
        sc.close();
    }
}
