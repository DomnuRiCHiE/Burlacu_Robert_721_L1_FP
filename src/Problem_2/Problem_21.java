package Problem_2;
import java.util.ArrayList;

public class Problem_21 {
    /**
     * Finds the greatest number in a given number sequence
     * @param numbers - arraylist with a number sequence
     * @return greatest number from sequence
     */
    public static int greatestNumber(ArrayList<Integer> numbers) {
        int greatestNumber;

        if(numbers.size() > 1) greatestNumber = numbers.get(0);
        else return -1;

        for(int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) > greatestNumber) {
                greatestNumber = numbers.get(i);
            }
        }

        return greatestNumber;
    }
}
