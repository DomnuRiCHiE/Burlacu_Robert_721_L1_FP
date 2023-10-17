package Problem_3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_3.Problem_32.subtractionOfTwoNumbers;
import static org.junit.jupiter.api.Assertions.*;

class Problem_32Test {
    @Test
    void testCase1() {
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(3);
        number1.add(8);
        number1.add(0);
        number1.add(0);
        number1.add(0);

        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(1);
        number2.add(5);
        number2.add(0);
        number2.add(0);
        number2.add(0);

        ArrayList<Integer> finalSubtraction = new ArrayList<>();
        finalSubtraction.add(2);
        finalSubtraction.add(3);
        finalSubtraction.add(0);
        finalSubtraction.add(0);
        finalSubtraction.add(0);

        assertEquals(subtractionOfTwoNumbers(number1, number2), finalSubtraction);
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

        assertNull(subtractionOfTwoNumbers(number1, number2));
    }
}