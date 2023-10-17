package Problem_2;
import java.util.ArrayList;

public class Problem_22 {
    /**
     * Finds the smallest number in a given number sequence
     * @param numbers - arraylist with a number sequence
     * @return smallest number from sequence
     */
    public static int smallestNumber(ArrayList<Integer> numbers) {
        int smallestNumber;

        if(numbers.size() > 1) smallestNumber = numbers.get(0);
        else return -1;

        for(int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) < smallestNumber) {
                smallestNumber = numbers.get(i);
            }
        }

        return smallestNumber;
    }
}
