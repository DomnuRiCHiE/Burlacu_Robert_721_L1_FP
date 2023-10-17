package Problem_4;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_4.Problem_43.mostExpensiveUsbDrive;
import static org.junit.jupiter.api.Assertions.*;

class Problem_43Test {
    @Test
    void testCase1() {
        ArrayList<Integer> usbDrivers = new ArrayList<>();
        usbDrivers.add(21);
        usbDrivers.add(46);
        usbDrivers.add(30);
        usbDrivers.add(50);
        usbDrivers.add(34);

        assertEquals(mostExpensiveUsbDrive(usbDrivers), 50);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> usbDrivers = new ArrayList<>();

        assertEquals(mostExpensiveUsbDrive(usbDrivers), -1);
    }
}
