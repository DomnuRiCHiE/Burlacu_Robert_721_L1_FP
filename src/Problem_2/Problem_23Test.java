package Problem_2;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_2.Problem_23.maximumSum;
import static org.junit.jupiter.api.Assertions.*;

class Problem_23Test {
    @Test
    void testCase1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(78);
        numbers.add(54);
        numbers.add(43);
        numbers.add(13);

        assertEquals(maximumSum(numbers), 205);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(78);
        numbers.add(54);
        numbers.add(43);
        numbers.add(13);

        assertNotEquals(maximumSum(numbers), 283);
    }
}
