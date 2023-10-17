package Problem_1;
import java.util.ArrayList;

public class Problem_13 {
    /**
     * Rounds up the marks of an arraylist to the next multiple of 5 if the rest of the division
     * between the mark and 5 is greater than 2 and the mark is satisfactory (at least 38)
     * @param marks - arraylist of marks
     * @return arraylist of marks rounded up
     */
    public static ArrayList<Integer> roundedMarks(ArrayList<Integer> marks) {
        ArrayList<Integer> roundedMarks = new ArrayList<>();

        for(int i = 0; i < marks.size(); i++) {
            if((marks.get(i) % 5) > 2 && marks.get(i) > 37) {
                roundedMarks.add(marks.get(i) + 5 - marks.get(i) % 5);
            }
            else roundedMarks.add(marks.get(i));
        }

        return roundedMarks;
    }
}
