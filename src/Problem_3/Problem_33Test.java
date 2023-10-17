package Problem_3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_3.Problem_33.multiplicationOfTwoNumbers;
import static org.junit.jupiter.api.Assertions.*;

class Problem_33Test {
    @Test
    void testCase1() {
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(1);
        number1.add(3);
        number1.add(0);
        number1.add(0);
        number1.add(0);

        ArrayList<Integer> finalMultiplication = new ArrayList<>();
        finalMultiplication.add(2);
        finalMultiplication.add(6);
        finalMultiplication.add(0);
        finalMultiplication.add(0);
        finalMultiplication.add(0);

        assertEquals(multiplicationOfTwoNumbers(number1, 2), finalMultiplication);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(1);
        number1.add(3);
        number1.add(0);
        number1.add(0);
        number1.add(0);

        assertNull(multiplicationOfTwoNumbers(number1, 12));
    }
}
