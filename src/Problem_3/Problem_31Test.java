package Problem_3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_3.Problem_31.sumOfTwoNumbers;
import static org.junit.jupiter.api.Assertions.*;

class Problem_31Test {
    @Test
    void testCase1() {
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(1);
        number1.add(3);
        number1.add(0);
        number1.add(0);
        number1.add(0);

        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(3);
        number2.add(8);
        number2.add(0);
        number2.add(0);
        number2.add(0);

        ArrayList<Integer> finalSum = new ArrayList<>();
        finalSum.add(5);
        finalSum.add(1);
        finalSum.add(0);
        finalSum.add(0);
        finalSum.add(0);

        assertEquals(sumOfTwoNumbers(number1, number2), finalSum);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(1);
        number1.add(3);
        number1.add(0);
        number1.add(0);
        number1.add(0);

        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(3);
        number2.add(8);
        number2.add(0);
        number2.add(0);
        number2.add(0);
        number2.add(0);

        assertNull(sumOfTwoNumbers(number1, number2));
    }
}
