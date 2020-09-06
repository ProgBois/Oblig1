package Forsoek1;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Rutsjebane {

    private BlockingQueue<Integer> bane = new LinkedBlockingQueue<>(5);
    private int burger = 1;

    public void leggTilHamburger(int kokkenummer) throws InterruptedException {
        bane.put(burger++);
        System.out.println("Forsoek1.Kokk" + kokkenummer + " legger på hamburger  (" + (burger-1) + ") => " + bane.toString());
    }

    public void taUtHamburger(int servitoernummer) throws InterruptedException {
        System.out.println("Servitør" + servitoernummer + " tar av hamburger (" + bane.take() + ") <= " + bane.toString());
    }

}
