package Problem_1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_1.Problem_11.unsatisfactoryMarks;

class Problem_11Test {
    @Test
    void testCase1() {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(76);
        marks.add(54);
        marks.add(40);
        marks.add(13);

        ArrayList<Integer> unsatisfactoryMarks = unsatisfactoryMarks(marks);

        assertEquals(unsatisfactoryMarks.size(), 2);
        assertEquals(unsatisfactoryMarks.get(0), 30);
        assertEquals(unsatisfactoryMarks.get(1), 13);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(30);
        marks.add(76);
        marks.add(54);
        marks.add(40);
        marks.add(13);

        ArrayList<Integer> unsatisfactoryMarks = unsatisfactoryMarks(marks);

        assertNotEquals(unsatisfactoryMarks.size(), 3);
        assertNotEquals(unsatisfactoryMarks.get(0), 13);
    }
}