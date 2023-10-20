package Problem_3;
import java.util.ArrayList;

public class Problem_34 {
    /**
     * Calculates the division of two numbers (one in array form and one integer with only one digit)
     * @param number1 first number as array
     * @param number2 second number as integer with only one digit
     * @return the division of the two numbers, as long as one is in array form and the other an array with only one digit
     */
    public static ArrayList<Integer> divisionOfTwoNumbers(ArrayList<Integer> number1, int number2) {
        ArrayList<Integer> finalDivision = new ArrayList<>();

        if(number2 > 9 || number2 < 0) {
            return null;
        }

        int underflow = 0;
        for(int i = 0; i < number1.size(); i++) {
            if(underflow > 0) {
                finalDivision.addLast((underflow * 10 + number1.get(i)) / number2);
                underflow = number1.get(i) % number2;
            }
            else {
                finalDivision.addLast( number1.get(i) / number2);
                underflow = number1.get(i) % number2;
            }
        }
        while(finalDivision.getFirst() == 0)
            finalDivision.removeFirst();

        return finalDivision;
    }
}
