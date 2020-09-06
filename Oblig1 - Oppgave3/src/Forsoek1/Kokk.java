package Forsoek1;

import java.util.Random;

public class Kokk extends Thread {

    Rutsjebane rutsjebane;
    int kokkNummer;
    Random random = new Random();

    public Kokk(Rutsjebane rutsjebane, int kokkNummer) {
        this.rutsjebane = rutsjebane;
        this.kokkNummer = kokkNummer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                leggTilHamburger();
            } catch (InterruptedException ignored) {
            }
        }
    }

    private void leggTilHamburger() throws InterruptedException {
        rutsjebane.leggTilHamburger(kokkNummer);
        int tid = random.nextInt(4) + 2;
        sleep(tid * 1000);
    }
}
