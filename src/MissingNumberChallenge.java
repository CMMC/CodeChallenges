/*
Given an array containing integers that when sorted, the next and previous value is +1 and -1 unless the next or
    previous value is the missing integer, find that missing integer.
Assumption:
    When sorted in ascending order, the array will have values from 0 and until a number
    The length of the input is 2
    There are no duplicate values in the input
    There can only be 0 or 1 missing number
    If there are no missing number it should return -1
Examples:
    Input: [3, 0, 2]
    Output: 1

    Input: [0, 4, 2, 6, 1, 7, 8, 9, 5]
    Output: 3

    Input: [5, 2, 3, 1, 4, 0]
    Output: -1
 */
public class MissingNumberChallenge {
    public static int getMissingNumber(int array[]){
        int highestNumber = getHighestNumberFromArray(array);

        if (array.length != highestNumber)
            return -1;
        else {
            int idealTotal = 0;
            for(int i = 0; i < array.length + 1; i++)
                idealTotal += i;

            int actualTotal = getTotalFromArray(array);

            return idealTotal - actualTotal;
        }

    }

    private static int getHighestNumberFromArray(int array[]) {
        int highestNumber = 0;
        for(int i = 0; i < array.length; i++){
            if (highestNumber < array[i])
                highestNumber = array[i];
        }

        return highestNumber;
    }

    private static int getTotalFromArray(int array[]) {
        int total = 0;
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }

        return total;
    }


}
