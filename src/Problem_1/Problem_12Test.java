package Problem_1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_1.Problem_12.averageMark;

class Problem_12Test {
    @Test
    void testCase1() {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(76);
        marks.add(54);
        marks.add(40);
        marks.add(13);

        assertEquals(averageMark(marks), 42.6);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> marks = new ArrayList<>();
        assertEquals(averageMark(marks), -1.0);
    }
}
