package Problem_4;
import java.util.ArrayList;
import java.util.Collections;

public class Problem_44 {
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
