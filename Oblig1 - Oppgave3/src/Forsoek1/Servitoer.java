package Forsoek1;

import java.util.Random;

public class Servitoer extends Thread {

    Rutsjebane rutsjebane;
    int servitoerNummer;
    Random random = new Random();

    public Servitoer(Rutsjebane rutsjebane, int servitoerNummer) {
        this.rutsjebane = rutsjebane;
        this.servitoerNummer = servitoerNummer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                taHamburger();
            } catch (InterruptedException ignored) {
            }
        }
    }

    private void taHamburger() throws InterruptedException {
        rutsjebane.taUtHamburger(servitoerNummer);
        int tid = random.nextInt(4) + 2;
        sleep(tid * 1000);
    }
}
