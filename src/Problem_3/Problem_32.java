package Problem_3;
import java.util.ArrayList;
import static Problem_3.Problem_3.fromArrayToNumber;
import static Problem_3.Problem_3.fromNumberToArray;

public class Problem_32 {
    public static ArrayList<Integer> subtractionOfTwoNumbers(ArrayList<Integer> number1, ArrayList<Integer> number2) {
        int subtraction, firstNumber, secondNumber;
        ArrayList<Integer> finalSubtraction;

        firstNumber = fromArrayToNumber(number1);
        secondNumber = fromArrayToNumber(number2);

        subtraction = firstNumber - secondNumber;
        finalSubtraction = fromNumberToArray(subtraction);

        return finalSubtraction;
    }
}
