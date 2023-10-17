package Problem_1;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_1.Problem_14.maximumRoundedMark;
import static org.junit.jupiter.api.Assertions.*;

class Problem_14Test {
    @Test
    void testCase1() {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(78);
        marks.add(54);
        marks.add(43);
        marks.add(13);

        assertEquals(maximumRoundedMark(marks), 80);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> marks = new ArrayList<>();

        assertNotEquals(maximumRoundedMark(marks), 78);
        assertEquals(maximumRoundedMark(marks), -1);
    }
}
