import Koe.TabellKoe;

public class Rutsjebane {

    private TabellKoe<Integer> bane = new TabellKoe<>(5); // Hamburger
    private int burgerNr = 1;

    public synchronized int leggTilHamburger() {
        bane.innKoe(burgerNr);
        burgerNr++;
        return burgerNr-1;
    }

    public synchronized int taUtHamburger() {
        return bane.utKoe();
    }

    public boolean erTom() {
        return bane.erTom();
    }

    public boolean erFull() {
        return bane.antall() == 5;
    }

    @Override
    public String toString() {

        /*
        StringBuilder baneTilstand = new StringBuilder();
        for (int i = 0; i < bane.antall(); i++) {
            baneTilstand.append("(").append(bane.getKoe()[i].toString()).append("), ");
        }
        return baneTilstand.toString();
        */

        return " ";
    }
}
