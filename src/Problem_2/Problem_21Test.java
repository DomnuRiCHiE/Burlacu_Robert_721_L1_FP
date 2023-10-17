package Problem_2;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_2.Problem_21.greatestNumber;
import static org.junit.jupiter.api.Assertions.*;

class Problem_21Test {
    @Test
    void testCase1() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(30);
        numbers.add(78);
        numbers.add(54);
        numbers.add(43);
        numbers.add(13);

        assertEquals(greatestNumber(numbers), 78);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> numbers = new ArrayList<>();

        assertEquals(greatestNumber(numbers), -1);
        assertNotEquals(greatestNumber(numbers), 78);
    }
}
