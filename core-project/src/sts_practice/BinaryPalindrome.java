package sts_practice;

import java.util.Scanner;

public class BinaryPalindrome {
    static boolean isBinaryPalindrome(int n) {
        int left = 31;  // Start from most significant bit
        int right = 0;  // Start from least significant bit

        // Move left pointer to first '1'
        while (left > right && ((n >> left) & 1) == 0) {
            left--;
        }

        // Compare bits from both ends
        while (left > right) {
            int leftBit = (n >> left) & 1;
            int rightBit = (n >> right) & 1;

            if (leftBit != rightBit) {
                return false; // Not a palindrome
            }

            left--;
            right++;
        }

        return true; // All bits matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        if (isBinaryPalindrome(num)) {
            System.out.println(num + " is a binary palindrome.");
        } else {
            System.out.println(num + " is NOT a binary palindrome.");
        }
    }
}
