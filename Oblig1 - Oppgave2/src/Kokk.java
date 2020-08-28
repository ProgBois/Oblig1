import java.util.Random;

public class Kokk extends Thread {

    Rutsjebane rutsjebane;
    int nummer;
    Random random = new Random();

    public Kokk(Rutsjebane rutsjebane, int nummer) {
        this.rutsjebane = rutsjebane;
        this.nummer = nummer;
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
            System.out.println("### Kokk" + nummer + " er klar med en hamburger, men rutsjebanen er full. Venter! ###");
        }
        synchronized (rutsjebane) {
            while (rutsjebane.erFull()) {
                rutsjebane.wait();
            }
            int burgerNr = rutsjebane.leggTilHamburger();
            System.out.println("Kokk" + nummer + " legger på hamburger  (" + burgerNr + ") => " + rutsjebane.toString());
            rutsjebane.notifyAll();
        }
    }
}
