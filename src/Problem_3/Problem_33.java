package Problem_3;
import java.util.ArrayList;

public class Problem_33 {
    /**
     * Calculates the multiplication of two numbers (one in array form and one integer with only one digit)
     * @param number1 first number as array
     * @param number2 second number as integer with only one digit
     * @return the multiplication of the two numbers, as long as one is in array form and the other an array with only one digit
     */
    public static ArrayList<Integer> multiplicationOfTwoNumbers(ArrayList<Integer> number1, int number2) {
        ArrayList<Integer> finalMultiplication = new ArrayList<>();
        int overflow = 0;

        if(number2 > 9 || number2 < 0) {
            return null;
        }

        for(int i = number1.size() - 1; i >= 0; i--) {
            if(number1.get(i) * number2 > 9) {
                finalMultiplication.addFirst((number1.get(i) * number2) % 10 + overflow);
                overflow =  (number1.get(i) * number2) / 10;
            }
            else {
                finalMultiplication.addFirst((number1.get(i) * number2) % 10 + overflow);
                overflow =  (number1.get(i) * number2) / 10;
            }
        }
        if(overflow > 0) finalMultiplication.addFirst(overflow);

        return finalMultiplication;
    }
}
