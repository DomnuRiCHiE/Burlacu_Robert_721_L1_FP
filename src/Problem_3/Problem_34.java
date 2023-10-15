package Problem_3;
import java.util.ArrayList;
import static Problem_3.Problem_3.fromArrayToNumber;
import static Problem_3.Problem_3.fromNumberToArray;

public class Problem_34 {
    public static ArrayList<Integer> divisionOfTwoNumbers(ArrayList<Integer> number1, int number2) {
        int division, firstNumber;
        ArrayList<Integer> finalDivision;

        firstNumber = fromArrayToNumber(number1);

        division = firstNumber / number2;
        finalDivision = fromNumberToArray(division);

        return finalDivision;
    }
}
