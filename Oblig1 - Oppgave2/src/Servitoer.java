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

    public void taHamburger() throws InterruptedException {
        int tid = random.nextInt(4) + 2;
        sleep(tid * 1000);
        if (rutsjebane.erTom()) {
            System.out.println("### Servitør" + servitoerNummer + " vil ta en hamburger, men rutsjebanen er tom. Venter! ###");
        }
        synchronized (rutsjebane) {
            while (rutsjebane.erTom()) {
                rutsjebane.wait();
            }
            int burgerNummer = rutsjebane.taUtHamburger();
            System.out.println("Servitør" + servitoerNummer + " tar av hamburger (" + burgerNummer + ") <= " + rutsjebane.toString());
            rutsjebane.notifyAll();
        }
    }
}
