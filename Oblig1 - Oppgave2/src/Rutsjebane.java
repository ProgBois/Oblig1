
import java.util.*;

public class Rutsjebane {

    LinkedList<Integer> rutsjebane = new LinkedList<>();

    private int burger = 1;

    public int leggTilHamburger() {
        rutsjebane.add(burger);
        burger++;
        return burger-1;
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
        String str = "[";
        for (int i = 0; i < rutsjebane.size(); i++) {
            if (i == rutsjebane.size()-1) {
                str += "(" + rutsjebane.toArray()[i] + ")";
            } else {
                str += "(" + rutsjebane.toArray()[i] + "), ";
            }
        }
        return str + "]";
    }
}
