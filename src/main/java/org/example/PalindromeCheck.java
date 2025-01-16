package org.example;

public class PalindromeCheck {
    public static boolean isPalindrome(int number) {
        String strNumber = Integer.toString(number);
        int left = 0;
        int right = strNumber.length() - 1;

        while (left < right) {
            if (strNumber.charAt(left) != strNumber.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}