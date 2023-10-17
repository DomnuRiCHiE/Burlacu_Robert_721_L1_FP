package Problem_2;
import java.util.ArrayList;
import static Problem_2.Problem_21.greatestNumber;

public class Problem_24 {
    /**
     * Calculates the minimum sum of n-1 numbers from a given sequence
     * @param numbers - arraylist with a number sequence
     * @return minimum sum of n-1 numbers from sequence
     */
    public static int minimumSum(ArrayList<Integer> numbers) {
        int minimumSum = 0;

        for(int i = 0 ; i < numbers.size(); i++) {
            minimumSum += numbers.get(i);
        }

        return minimumSum - greatestNumber(numbers);
    }
}
