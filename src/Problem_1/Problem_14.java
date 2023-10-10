package Problem_1;
import java.util.ArrayList;
import static Problem_1.Problem_13.roundedMarks;

public class Problem_14 {
    public static int maximumRoundedMark(ArrayList<Integer> marks) {
        ArrayList<Integer> roundedMarks = roundedMarks(marks);
        int maximumMark;

        if(!roundedMarks.isEmpty()) maximumMark = roundedMarks.get(0);
        else return -1;

        for(int i = 1; i < marks.size(); i++) {
            if(marks.get(i) > maximumMark) {
                maximumMark = roundedMarks.get(i);
            }
        }
        return maximumMark;
    }
}
