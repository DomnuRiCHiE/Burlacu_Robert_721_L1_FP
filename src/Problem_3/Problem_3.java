package Problem_3;
import java.util.ArrayList;
import static Problem_3.Problem_31.sumOfTwoNumbers;


public class Problem_3 {
    public ArrayList<Integer> number1 = new ArrayList<>();
    public ArrayList<Integer> number2 = new ArrayList<>();

    public void number1() {
        number1.add(1);
        number1.add(3);
        number1.add(0);
        number1.add(0);
        number1.add(0);
        number1.add(0);
        number1.add(0);
    }

    public void number2() {
        number2.add(8);
        number2.add(7);
        number2.add(0);
        number2.add(0);
        number2.add(0);
        number2.add(0);
        number2.add(0);
    }

    public static int fromArrayToNumber(ArrayList<Integer> array) {
        int number = 0, position = 1;
        while(!array.isEmpty()) {
            number = position * array.get(0) + number;
            position *= 10;
            array.remove(0);
        }
        return number;
    }

    public static ArrayList<Integer> fromNumberToArray(int number) {
        ArrayList<Integer> array = new ArrayList<>();
        while(number > 0) {
            array.addFirst(number % 10);
            number /= 10;
        }
        return array;
    }

    public void problem3() {

        number1();
        number2();
        System.out.println("Problem 3 tasks:");

        System.out.println("1. Show the sum of the 2 numbers");
        System.out.println(sumOfTwoNumbers(number1, number2));

        System.out.println("2. Show the subtraction of the 2 numbers");
        //System.out.println(smallestNumber(numbers));

        System.out.println("3. Show the multiplication of a number with a number of 1 digit");
        //System.out.println(maximumSum(numbers));

        System.out.println("4. Show the division of a number with a number of 1 digit");
        //System.out.println(minimumSum(numbers));
    }
}
