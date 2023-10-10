package Problem_1;
import java.util.ArrayList;
import java.util.Scanner;

import static Problem_1.Problem_11.unsatisfactoryMarks;
import static Problem_1.Problem_12.averageMark;
import static Problem_1.Problem_13.roundedMarks;
import static Problem_1.Problem_14.maximumRoundedMark;


public class Problem_1 {
    public ArrayList<Integer> marks = new ArrayList<>();

    public void predeterminedMarks() {
        marks.add(20);
        marks.add(67);
        marks.add(58);
        marks.add(90);
        marks.add(22);
        marks.add(40);
        marks.add(51);
        marks.add(54);
        marks.add(33);
        marks.add(100);
    }

    public void problem1() {
        Scanner text = new Scanner(System.in);

        System.out.println("Which task would you like to solve?");
        System.out.println("1. Show all unsatisfactory marks");
        System.out.println("2. Show the average value of all marks");
        System.out.println("3. Show all marks rounded up");
        System.out.println("4. Show the highest mark after round up");
        System.out.println("Your choice: ");

        int task = text.nextInt();

        switch (task) {
            case 1:
                System.out.println(unsatisfactoryMarks(marks));
                break;
            case 2:
                System.out.println(averageMark(marks));
                break;
            case 3:
                System.out.println(roundedMarks(marks));
                break;
            case 4:
                System.out.println(maximumRoundedMark(marks));
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
