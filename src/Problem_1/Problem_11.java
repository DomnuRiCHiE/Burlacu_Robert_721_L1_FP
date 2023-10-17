package Problem_1;
import java.util.ArrayList;

public class Problem_11 {
    /**
     * Filters unsatisfactory marks (marks under 40 out of 100 points)
     * @param marks - arraylist of marks
     * @return arraylist of unsatisfactory marks
     */
    public static ArrayList<Integer> unsatisfactoryMarks(ArrayList<Integer> marks) {
        ArrayList<Integer> unsatisfactoryMarks = new ArrayList<>();

        for(int i = 0; i < marks.size(); i++) {
            if(marks.get(i) < 40) {
                unsatisfactoryMarks.add(marks.get(i));
            }
        }

        return unsatisfactoryMarks;
    }
}
