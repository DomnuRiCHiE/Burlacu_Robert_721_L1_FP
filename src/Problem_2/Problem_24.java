package Problem_2;
import java.util.ArrayList;
import static Problem_2.Problem_21.greatestNumber;

public class Problem_24 {
    public static int minimumSum(ArrayList<Integer> numbers) {
        int minimumSum = 0;

        for(int i = 0 ; i < numbers.size(); i++) {
            minimumSum += numbers.get(i);
        }

        return minimumSum - greatestNumber(numbers);
    }
}
