package Problem_4;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_4.Problem_41.cheapestKeyboard;
import static org.junit.jupiter.api.Assertions.*;

class Problem_41Test {
    @Test
    void testCase1() {
        ArrayList<Integer> keyboards = new ArrayList<>();
        keyboards.add(21);
        keyboards.add(46);
        keyboards.add(30);
        keyboards.add(50);
        keyboards.add(34);

        assertEquals(cheapestKeyboard(keyboards), 21);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> keyboards = new ArrayList<>();
        keyboards.add(21);
        keyboards.add(46);
        keyboards.add(30);
        keyboards.add(50);
        keyboards.add(34);

        assertNotEquals(cheapestKeyboard(keyboards), 50);
    }
}
