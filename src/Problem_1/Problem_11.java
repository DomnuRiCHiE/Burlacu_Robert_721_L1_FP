package Problem_1;
import java.util.ArrayList;

public class Problem_11 {
    public static ArrayList<Integer> unsatisfactoryMarks(ArrayList<Integer> marks) {
        ArrayList<Integer> unsatisfactoryMarks = new ArrayList<>();
        int j = 0;

        for(int i = 0; i <= marks.size(); i++) {
            if(marks.get(i) < 40) {
                unsatisfactoryMarks.set(j, marks.get(i));
                j++;
            }
        }

        return unsatisfactoryMarks;
    }
}
