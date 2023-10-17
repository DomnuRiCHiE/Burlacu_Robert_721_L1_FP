package Problem_3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static Problem_3.Problem_34.divisionOfTwoNumbers;
import static org.junit.jupiter.api.Assertions.*;

class Problem_34Test {
    @Test
    void testCase1() {
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(1);
        number1.add(4);
        number1.add(0);
        number1.add(0);
        number1.add(0);

        ArrayList<Integer> finalMultiplication = new ArrayList<>();
        finalMultiplication.add(7);
        finalMultiplication.add(0);
        finalMultiplication.add(0);
        finalMultiplication.add(0);

        assertEquals(divisionOfTwoNumbers(number1, 2), finalMultiplication);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(1);
        number1.add(3);
        number1.add(0);
        number1.add(0);
        number1.add(0);

        assertNull(divisionOfTwoNumbers(number1, 12));
    }
}