package Problem_2;
import java.util.ArrayList;
import static Problem_2.Problem_22.smallestNumber;

public class Problem_23 {
    /**
     * Calculates the maximum sum of n-1 numbers from sequence
     * @param numbers - arraylist with a number sequence
     * @return maximum sum of n-1 numbers from sequence
     */
    public static int maximumSum(ArrayList<Integer> numbers) {
        int maximumSum = 0;

        for(int i = 0 ; i < numbers.size(); i++) {
            maximumSum += numbers.get(i);
        }

        return maximumSum - smallestNumber(numbers);
    }
}
