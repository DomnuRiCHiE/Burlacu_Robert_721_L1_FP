package Problem_4;
import java.util.ArrayList;

import static Problem_4.Problem_41.cheapestKeyboard;
import static Problem_4.Problem_42.mostExpensiveItem;
import static Problem_4.Problem_43.mostExpensiveUsbDrive;
import static Problem_4.Problem_44.amountPaid;

public class Problem_4 {

    public ArrayList<Integer> usbDrive = new ArrayList<>();
    public ArrayList<Integer> keyboard = new ArrayList<>();

    public void keyboardLoader() {
        keyboard.add(40);
        keyboard.add(35);
        keyboard.add(70);
        keyboard.add(30);
    }

    public void usbDriveLoader() {
        usbDrive.add(20);
        usbDrive.add(15);
        usbDrive.add(40);
        usbDrive.add(30);
    }

    public void problem4() {

        keyboardLoader();
        usbDriveLoader();
        System.out.println("Problem 4 tasks:");

        System.out.println("1. Show the cheapest Keyboard");
        System.out.println(cheapestKeyboard(keyboard));

        System.out.println("2. Show the cheapest available item");
        System.out.println(mostExpensiveItem(keyboard, usbDrive));

        System.out.println("3. Show the most expensive USB Drive Markus can buy");
        System.out.println(mostExpensiveUsbDrive(usbDrive));

        System.out.println("4. Show the sum of money Markus pays to get a USB Drive and a Keyboard");
        System.out.println(amountPaid(60, keyboard, usbDrive));
    }
}
