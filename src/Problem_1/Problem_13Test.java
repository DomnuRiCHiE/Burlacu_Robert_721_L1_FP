package Problem_1;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_1.Problem_13.roundedMarks;
import static org.junit.jupiter.api.Assertions.*;

class Problem_13Test {
    @Test
    void testCase1() {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(78);
        marks.add(54);
        marks.add(43);
        marks.add(13);

        ArrayList<Integer> roundedMarks = roundedMarks(marks);

        assertEquals(roundedMarks.get(0), 30);
        assertEquals(roundedMarks.get(1), 80);
        assertEquals(roundedMarks.get(2), 55);
        assertEquals(roundedMarks.get(3), 45);
        assertEquals(roundedMarks.get(4), 13);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(29);
        marks.add(78);
        marks.add(54);
        marks.add(43);
        marks.add(13);

        ArrayList<Integer> roundedMarks = roundedMarks(marks);

        assertNotEquals(roundedMarks.get(0), 30);
        assertNotEquals(roundedMarks.get(1), 78);
        assertNotEquals(roundedMarks.get(2), 54);
        assertNotEquals(roundedMarks.get(3), 43);
        assertNotEquals(roundedMarks.get(4), 15);
    }
}
