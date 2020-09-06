package Forsoek1;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Rutsjebane rutsjebane = new Rutsjebane();

        Kokk kokk1 = new Kokk(rutsjebane, 1);
        Kokk kokk2 = new Kokk(rutsjebane, 2);
        Kokk kokk3 = new Kokk(rutsjebane, 3);

        Servitoer servitoer1 = new Servitoer(rutsjebane, 1);
        Servitoer servitoer2 = new Servitoer(rutsjebane, 2);

        kokk1.start();
        kokk2.start();
        kokk3.start();
        servitoer1.start();
        servitoer2.start();

    }
}
