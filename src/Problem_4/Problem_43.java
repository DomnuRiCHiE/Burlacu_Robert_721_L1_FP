package Problem_4;
import java.util.ArrayList;

public class Problem_43 {
    public static int mostExpensiveUsbDrive(ArrayList<Integer> usbDrive) {
        int mostExpensiveUsbDrive;

        if(!usbDrive.isEmpty()) mostExpensiveUsbDrive = usbDrive.get(0);
        else return -1;

        for(int i = 1; i < usbDrive.size(); i++) {
            if(mostExpensiveUsbDrive < usbDrive.get(i)) {
                mostExpensiveUsbDrive = usbDrive.get(i);
            }
        }

        return mostExpensiveUsbDrive;
    }
}
