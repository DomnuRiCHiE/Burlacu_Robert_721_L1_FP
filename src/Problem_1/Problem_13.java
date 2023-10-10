package Problem_1;
import java.util.ArrayList;

public class Problem_13 {
    public static ArrayList<Integer> roundedMarks(ArrayList<Integer> marks) {
        ArrayList<Integer> roundedMarks = new ArrayList<>();

        for(int i = 0; i < marks.size(); i++) {
            if(marks.get(i) % 5 < 3 && marks.get(i) > 40) {
                roundedMarks.set(i, marks.get(i) + 5 - marks.get(i) % 5);
            }
            else roundedMarks.set(i, marks.get(i));
        }

        return roundedMarks;
    }
}