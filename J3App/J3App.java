
import java.util.*;

/**
 *
 * @author francisco
 */
public class J3App {

    public static void main(String[] args) {
        /* */
        ArrayList<Pair> weekDays = new ArrayList<>();
        PairManager pairManager = new PairManager(weekDays);

        /* fill the list */
        weekDays.add(new Pair(1, "sunday"));
        weekDays.add(new Pair(2, "monday"));
        weekDays.add(new Pair(3, "tuesday"));
        weekDays.add(new Pair(4, "wednesday"));
        weekDays.add(new Pair(5, "thursday"));
        weekDays.add(new Pair(6, "friday"));
        weekDays.add(new Pair(7, "saturday"));

        pairManager.shuffle();
        pairManager.print();

    }

}
