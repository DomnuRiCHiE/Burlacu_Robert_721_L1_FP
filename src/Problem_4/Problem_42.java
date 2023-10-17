package Problem_4;
import java.util.ArrayList;

public class Problem_42 {
    /**
     * Finds the most expensive item in a list of keyboards prices and a list of usb drive prices
     * @param keyboard - list of keyboard prices
     * @param usbDrive - list of usb drive prices
     * @return the most expensive item's price
     */
    public static int mostExpensiveItem(ArrayList<Integer> keyboard, ArrayList<Integer> usbDrive) {
        int mostExpensiveItem;
        ArrayList<Integer> allItems = new ArrayList<>();

        allItems.addAll(keyboard);
        allItems.addAll(usbDrive);

        if(!allItems.isEmpty()) mostExpensiveItem = allItems.get(0);
        else return -1;

        for(int i = 1; i < allItems.size(); i++) {
            if(mostExpensiveItem < allItems.get(i)) {
                mostExpensiveItem = allItems.get(i);
            }
        }

        return mostExpensiveItem;
    }
}
