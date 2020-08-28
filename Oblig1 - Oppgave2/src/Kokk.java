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

    public void leggTilHamburger() throws InterruptedException {
        int tid = random.nextInt(4) + 2;
        sleep(tid * 1000);
        if (rutsjebane.erFull()) {
            System.out.println("### Kokk" + kokkNummer + " er klar med en hamburger, men rutsjebanen er full. Venter! ###");
        }
        synchronized (rutsjebane) {
            while (rutsjebane.erFull()) {
                rutsjebane.wait();
            }
            int burgerNummer = rutsjebane.leggTilHamburger();
            System.out.println("Kokk" + kokkNummer + " legger på hamburger  (" + burgerNummer + ") => " + rutsjebane.toString());
            rutsjebane.notifyAll();
        }
    }
}
