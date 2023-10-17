package Problem_1;
import java.util.ArrayList;

public class Problem_12 {
    /**
     * Calculates the average mark
     * @param marks - arraylist of marks
     * @return average mark for an arraylist of marks, -1 if no marks are provided
     */
    public static double averageMark(ArrayList<Integer> marks) {
        double average = 0;
        int markNr = 0;

        for(int i = 0; i < marks.size(); i++) {
            average += marks.get(i);
            markNr++;
        }

        if(markNr > 0) {
            return average / markNr;
        }
        else return -1;
    }
}
