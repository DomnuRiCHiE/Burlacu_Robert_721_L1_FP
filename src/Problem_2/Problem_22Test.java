package Problem_2;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_2.Problem_22.smallestNumber;
import static org.junit.jupiter.api.Assertions.*;

class Problem_22Test {
    @Test
    void testCase1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(78);
        numbers.add(54);
        numbers.add(43);
        numbers.add(13);

        assertEquals(smallestNumber(numbers), 13);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> numbers = new ArrayList<>();

        assertEquals(smallestNumber(numbers), -1);
        assertNotEquals(smallestNumber(numbers), 13);
    }
}
