package Problem_4;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static Problem_4.Problem_44.amountPaid;
import static org.junit.jupiter.api.Assertions.*;

class Problem_44Test {
    @Test
    void testCase1() {
        ArrayList<Integer> keyboards = new ArrayList<>();
        keyboards.add(21);
        keyboards.add(46);
        keyboards.add(30);
        keyboards.add(50);
        keyboards.add(34);

        ArrayList<Integer> usbDrivers = new ArrayList<>();
        usbDrivers.add(11);
        usbDrivers.add(46);
        usbDrivers.add(70);
        usbDrivers.add(56);
        usbDrivers.add(24);

        assertEquals(amountPaid(60, keyboards, usbDrivers), 57);
    }

    @Test
    void testCase2() {
        ArrayList<Integer> keyboards = new ArrayList<>();
        keyboards.add(21);
        keyboards.add(46);
        keyboards.add(30);
        keyboards.add(50);
        keyboards.add(34);

        ArrayList<Integer> usbDrivers = new ArrayList<>();
        usbDrivers.add(11);
        usbDrivers.add(46);
        usbDrivers.add(70);
        usbDrivers.add(56);
        usbDrivers.add(24);

        assertEquals(amountPaid(10, keyboards, usbDrivers), -1);
    }
}
