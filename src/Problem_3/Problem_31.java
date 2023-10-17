package Problem_3;
import java.util.ArrayList;
import static Problem_3.Problem_3.fromArrayToNumber;
import static Problem_3.Problem_3.fromNumberToArray;

public class Problem_31 {
    /**
     * Calculates the sum of two numbers as arrays of single digits
     * @param number1 first number as array
     * @param number2 second number as array
     * @return sum of the two numbers, as long as they have the same number of digits
     */
    public static ArrayList<Integer> sumOfTwoNumbers(ArrayList<Integer> number1, ArrayList<Integer> number2) {
        int sum, firstNumber, secondNumber;
        ArrayList<Integer> finalSum;

        if(number1.size() != number2.size()) return null;

        firstNumber = fromArrayToNumber(number1);
        secondNumber = fromArrayToNumber(number2);

        if(firstNumber < 0 || secondNumber < 0) return null;

        sum = firstNumber + secondNumber;
        finalSum = fromNumberToArray(sum);

        return finalSum;
    }
}
