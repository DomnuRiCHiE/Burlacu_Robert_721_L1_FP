package Problem_1;

public class Problem_11 {
    public static int[] firstTask(int[] marks) {
        int[] unsatisfactoryMarks = new int[20];
        int j = 0;
        for(int i = 0; i <= marks.length; i++) {
            if(marks[i] < 40) {
                unsatisfactoryMarks[j] = marks[i];
                j++;
            }
        }
        return unsatisfactoryMarks;
    }
}
