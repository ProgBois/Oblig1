
import java.util.*;

public class Rutsjebane {

    LinkedList<Integer> rutsjebane = new LinkedList<>();

    private int burgerNr = 1;

    public int leggTilHamburger() {
        rutsjebane.add(burgerNr);
        burgerNr++;
        return burgerNr-1;
    }

    public int taUtHamburger() {
        return rutsjebane.removeFirst();
    }

    public boolean erTom() {
        return rutsjebane.isEmpty();
    }

    public boolean erFull() {
        return rutsjebane.size() == 5;
    }

    @Override
    public String toString() {
        String str2 = "[";
        for (int i = 0; i < rutsjebane.size(); i++) {
            if (i == rutsjebane.size()-1) {
                str2 += "(" + rutsjebane.toArray()[i] + ")";
            } else {
                str2 += "(" + rutsjebane.toArray()[i] + "), ";
            }
        }
        return str2 + "]";
    }
}
