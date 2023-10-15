package Problem_2;
import java.util.ArrayList;
import static Problem_2.Problem_21.greatestNumber;
import static Problem_2.Problem_22.smallestNumber;
import static Problem_2.Problem_23.maximumSum;
import static Problem_2.Problem_24.minimumSum;

public class Problem_2 {
    public ArrayList<Integer> numbers = new ArrayList<>();

    private void numbers() {
        numbers.add(20);
        numbers.add(67);
        numbers.add(58);
        numbers.add(90);
        numbers.add(22);
        numbers.add(40);
        numbers.add(51);
    }

    public void problem2() {

        numbers();
        System.out.println("Problem 2 tasks:");

        System.out.println("1. Show the smallest number");
        System.out.println(greatestNumber(numbers));

        System.out.println("2. Show the greatest number");
        System.out.println(smallestNumber(numbers));

        System.out.println("3. Show the maximum sum of n-1 numbers");
        System.out.println(maximumSum(numbers));

        System.out.println("4. Show the minimum sum of n-1 numbers");
        System.out.println(minimumSum(numbers));
    }
}
