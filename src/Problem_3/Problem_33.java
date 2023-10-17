package Problem_3;
import java.util.ArrayList;
import static Problem_3.Problem_3.fromArrayToNumber;
import static Problem_3.Problem_3.fromNumberToArray;

public class Problem_33 {
    /**
     * Calculates the multiplication of two numbers (one in array form and one integer with only one digit)
     * @param number1 first number as array
     * @param number2 second number as integer with only one digit
     * @return the multiplication of the two numbers, as long as one is in array form and the other an array with only one digit
     */
    public static ArrayList<Integer> multiplicationOfTwoNumbers(ArrayList<Integer> number1, int number2) {
        int multiplication, firstNumber;
        ArrayList<Integer> finalMultiplication;

        if(number2 > 9 || number2 < 0) {
            return null;
        }

        firstNumber = fromArrayToNumber(number1);

        multiplication = firstNumber * number2;
        finalMultiplication = fromNumberToArray(multiplication);

        return finalMultiplication;
    }
}
