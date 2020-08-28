import java.util.Random;

public class Servitoer extends Thread {

    Rutsjebane rutsjebane;
    int servitoeNummer;
    Random random = new Random();

    public Servitoer(Rutsjebane rutsjebane, int nummer) {
        this.rutsjebane = rutsjebane;
        this.servitoeNummer = nummer;
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

    public void taHamburger() throws InterruptedException {
        int tid = random.nextInt(4) + 2;
        sleep(tid * 1000);
        if (rutsjebane.erTom()) {
            System.out.println("### Servitør" + servitoeNummer + " vil ta en hamburger, men rutsjebanen er tom. Venter! ###");
        }
        synchronized (rutsjebane) {
            while (rutsjebane.erTom()) {
                rutsjebane.wait();
            }
            int burgerNr = rutsjebane.taUtHamburger();
            System.out.println("Servitør" + servitoeNummer + " tar av hamburger (" + burgerNr + ") <= " + rutsjebane.toString());
            rutsjebane.notifyAll();
        }
    }
}
