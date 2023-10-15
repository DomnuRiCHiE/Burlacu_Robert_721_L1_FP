package Problem_4;
import java.util.ArrayList;

public class Problem_41 {
    public static int cheapestKeyboard(ArrayList<Integer> keyboard) {
        int cheapestKeyboard;

        if(!keyboard.isEmpty()) cheapestKeyboard = keyboard.get(0);
        else return -1;

        for(int i = 1; i < keyboard.size(); i++) {
            if(cheapestKeyboard > keyboard.get(i)) {
                cheapestKeyboard = keyboard.get(i);
            }
        }

        return cheapestKeyboard;
    }
}
