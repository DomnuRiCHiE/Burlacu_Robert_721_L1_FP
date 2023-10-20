package Problem_3;
import java.util.ArrayList;

public class Problem_32 {
    /**
     * Calculates the subtraction of two numbers as arrays of single digits
     * @param number1 first number as array
     * @param number2 second number as array
     * @return subtraction of the two numbers, as long as they have the same number of digits
     */
    public static ArrayList<Integer> subtractionOfTwoNumbers(ArrayList<Integer> number1, ArrayList<Integer> number2) {
        ArrayList<Integer> finalSubtraction = new ArrayList<>();

        if(number1.size() != number2.size()) return null;

        for(int i = number1.size() - 1; i >= 0; i--) {
            int tempSubtraction = number1.get(i) - number2.get(i);
            if(tempSubtraction < 0) {
                finalSubtraction.addFirst(number1.get(i - 1) * 10 + number1.get(i) - number2.get(i) % 10);
                finalSubtraction.addFirst(number1.get(i - 1) - 1);
            }
            else {
                finalSubtraction.addFirst( number1.get(i) - number2.get(i));
            }
        }

        return finalSubtraction;
    }
}
