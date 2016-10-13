
import java.util.*;

/**
 *
 * @author francisco
 */
public class PairManager {

    private final ArrayList<Pair> pairs;

    PairManager(ArrayList<Pair> pairs) {
        this.pairs = pairs;
    }

    public void shuffle() {
        Collections.shuffle(pairs);
    }

    public void print() {
        pairs.stream().forEach((pair) -> {
            System.out.println(pair.getValue());
        });
    }

}
