package Problem_1;
import java.util.ArrayList;

public class Problem_12 {
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
        else return 0;
    }
}
