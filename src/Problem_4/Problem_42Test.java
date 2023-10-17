package Problem_4;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static Problem_4.Problem_42.mostExpensiveItem;
import static org.junit.jupiter.api.Assertions.*;

class Problem_42Test {
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

        assertEquals(mostExpensiveItem(keyboards, usbDrivers), 70);
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

        assertNotEquals(mostExpensiveItem(keyboards, usbDrivers), 50);
    }
}
