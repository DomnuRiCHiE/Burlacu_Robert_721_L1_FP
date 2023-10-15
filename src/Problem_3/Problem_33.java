package Problem_3;
import java.util.ArrayList;
import static Problem_3.Problem_3.fromArrayToNumber;
import static Problem_3.Problem_3.fromNumberToArray;

public class Problem_33 {
    public static ArrayList<Integer> multiplicationOfTwoNumbers(ArrayList<Integer> number1, int number2) {
        int multiplication, firstNumber;
        ArrayList<Integer> finalMultiplication;

        firstNumber = fromArrayToNumber(number1);

        multiplication = firstNumber * number2;
        finalMultiplication = fromNumberToArray(multiplication);

        return finalMultiplication;
    }
}
