package Problem_1;

public class Problem_12 {
    public static double secondTask(int[] marks) {
        double average = 0;
        int markNr = 0;
        for(int i = 0; i < marks.length; i++) {
            average += marks[i];
            markNr++;
        }
        if(markNr > 0) {
            return average / markNr;
        }
        else return 0;
    }
}
