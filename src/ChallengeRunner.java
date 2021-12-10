/*
Runs code challenges scoured in anyplace
 */
public class ChallengeRunner {
    public static void main( String arg[] ) {
        int input[] = {0, 2, 3};
        System.out.println( MissingNumberChallenge.getMissingNumber(input) );

        input = new int[]{0, 4, 2, 6, 1, 7, 8, 9, 5};
        System.out.println( MissingNumberChallenge.getMissingNumber(input) );

        input = new int[]{5, 2, 3, 1, 4, 0};
        System.out.println( MissingNumberChallenge.getMissingNumber(input) );

        String palindromeInput = "racecar";
        if(IsPalindrome.isPalindrome(palindromeInput))
            System.out.println(palindromeInput + " is a palindrome");
        else
            System.out.println(palindromeInput + " is not a palindrome");

        palindromeInput = "boat";
        if(IsPalindrome.isPalindrome(palindromeInput))
            System.out.println(palindromeInput + " is a palindrome");
        else
            System.out.println(palindromeInput + " is not a palindrome");

        palindromeInput = "abccba";
        if(IsPalindrome.isPalindrome(palindromeInput))
            System.out.println(palindromeInput + " is a palindrome");
        else
            System.out.println(palindromeInput + " is not a palindrome");
    }
}
