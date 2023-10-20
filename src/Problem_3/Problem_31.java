package Problem_3;
import java.util.ArrayList;

public class Problem_31 {
    /**
     * Calculates the sum of two numbers as arrays of single digits
     * @param number1 first number as array
     * @param number2 second number as array
     * @return sum of the two numbers, as long as they have the same number of digits
     */
    public static ArrayList<Integer> sumOfTwoNumbers(ArrayList<Integer> number1, ArrayList<Integer> number2) {
        int overflow = 0;
        ArrayList<Integer> finalSum = new ArrayList<>();

        if(number1.size() != number2.size()) return null;

        for(int i = number1.size() - 1; i >= 0; i--) {
            int tempSum = number1.get(i) + number2.get(i);
            finalSum.addFirst(tempSum % 10 + overflow);
            overflow = tempSum / 10;
        }
        if(overflow > 0) {
            finalSum.addFirst(overflow);
        }
        return finalSum;
    }
}
