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
    }
}
