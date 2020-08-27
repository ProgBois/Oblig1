public class Main {

    public static void main(String[] args) {

        Melding melding = new Melding("Hallo verden!");

        SkrivUtTraad output = new SkrivUtTraad(melding);
        SkrivInnTraad input = new SkrivInnTraad(melding);

        output.start();
        input.start();

    }
}
