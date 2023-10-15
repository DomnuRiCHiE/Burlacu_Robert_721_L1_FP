package Problem_3;
import java.util.ArrayList;
import static Problem_3.Problem_31.sumOfTwoNumbers;
import static Problem_3.Problem_32.subtractionOfTwoNumbers;
import static Problem_3.Problem_33.multiplicationOfTwoNumbers;
import static Problem_3.Problem_34.divisionOfTwoNumbers;

public class Problem_3 {
    public ArrayList<Integer> number1 = new ArrayList<>();
    public ArrayList<Integer> number2 = new ArrayList<>();

    public void number1() {
        number1.add(8);
        number1.add(3);
        number1.add(0);
        number1.add(0);
        number1.add(0);
        number1.add(0);
        number1.add(0);
    }

    public void number2() {
        number2.add(5);
        number2.add(4);
        number2.add(0);
        number2.add(0);
        number2.add(0);
        number2.add(0);
        number2.add(0);
    }

    public static int fromArrayToNumber(ArrayList<Integer> array) {
        int number = 0;
        while(!array.isEmpty()) {
            number = number * 10 + array.get(0);
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

        System.out.println("Problem 3 tasks:");

        number1();
        number2();
        System.out.println("1. Show the sum of the 2 numbers");
        System.out.println(sumOfTwoNumbers(number1, number2));

        number1();
        number2();
        System.out.println("2. Show the subtraction of the 2 numbers");
        System.out.println(subtractionOfTwoNumbers(number1, number2));

        number1();
        System.out.println("3. Show the multiplication of a number with a number of 1 digit");
        System.out.println(multiplicationOfTwoNumbers(number1, 2));

        number1();
        System.out.println("4. Show the division of a number with a number of 1 digit");
        System.out.println(divisionOfTwoNumbers(number1, 2));
    }
}
