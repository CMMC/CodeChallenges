/*
Given a string, determine if it is a palindrome or not
Input: racecar
Output: true

Input: boat
Output: false

Input abccba
Output: true
 */
public class IsPalindrome {
    public static boolean isPalindrome(String input) {
        for(int i = 0; i <= input.length() / 2; i++) {
            if(input.charAt(i) != input.charAt(input.length() - i - 1))
                return false;
        }
        return true;
    }
}
