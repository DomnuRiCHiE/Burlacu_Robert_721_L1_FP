package Problem_3;
import java.util.ArrayList;
import static Problem_3.Problem_3.fromArrayToNumber;
import static Problem_3.Problem_3.fromNumberToArray;

public class Problem_31 {
    public static ArrayList<Integer> sumOfTwoNumbers(ArrayList<Integer> number1, ArrayList<Integer> number2) {
        int sum, firstNumber, secondNumber;
        ArrayList<Integer> finalSum;

        firstNumber = fromArrayToNumber(number1);
        secondNumber = fromArrayToNumber(number2);

        sum = firstNumber + secondNumber;
        finalSum = fromNumberToArray(sum);

        return finalSum;
    }
}
