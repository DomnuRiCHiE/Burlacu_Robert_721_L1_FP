package Problem_4;
import java.util.ArrayList;
import java.util.Collections;

public class Problem_44 {
    /**
     * Finds how much is spent at most depending on given budget
     * @param budget - budget available
     * @param keyboard - list of keyboard's prices
     * @param usbDrive - list of usb driver's prices
     * @return amount spent at most depending on budget, -1 if the budget cannot buy both a keyboard and usb drive
     */
    public static int amountPaid(int budget, ArrayList<Integer> keyboard, ArrayList<Integer> usbDrive) {
        int amountPaid = -1;

        Collections.sort(keyboard);
        Collections.sort(usbDrive);

        for(int i = 0; i < keyboard.size(); i++) {
            for(int j = 0; j < usbDrive.size(); j++) {
                if(keyboard.get(i) + usbDrive.get(j) <= budget) {
                    amountPaid = keyboard.get(i) + usbDrive.get(j);
                }
            }
        }

        return amountPaid;
    }
}
