
import java.util.*;

public class Rutsjebane {

    LinkedList<Integer> bane = new LinkedList<>();

    private int burgerNr = 1;

    public int leggTilHamburger() {
        bane.add(burgerNr);
        burgerNr++;
        return burgerNr-1;
    }

    public int taUtHamburger() {
        return bane.removeFirst();
    }

    public boolean erTom() {
        return bane.isEmpty();
    }

    public boolean erFull() {
        return bane.size() == 5;
    }

    @Override
    public String toString() {
        String str2 = "[";
        for (int i = 0; i < bane.size(); i++) {
            if (i == bane.size()-1) {
                str2 += "(" + bane.toArray()[i] + ")";
            } else {
                str2 += "(" + bane.toArray()[i] + "), ";
            }
        }
        return str2 + "]";
    }
}
