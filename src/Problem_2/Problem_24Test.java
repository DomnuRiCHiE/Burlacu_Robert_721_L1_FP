package Problem_2;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_2.Problem_24.minimumSum;
import static org.junit.jupiter.api.Assertions.*;

class Problem_24Test {
    @Test
    void testCase1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(78);
        numbers.add(54);
        numbers.add(43);
        numbers.add(13);

        assertEquals(minimumSum(numbers), 140);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(78);
        numbers.add(54);
        numbers.add(43);
        numbers.add(13);

        assertNotEquals(minimumSum(numbers), 283);
    }
}
