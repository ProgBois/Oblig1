public class Main {

    public static void main(String[] args) {

        Thread output = new SkrivUtTraad();
        Thread input = new SkrivInnTraad();

        output.start();
        input.start();

        boolean fortsette = true;
        String utTekst;

        while (fortsette) {
            utTekst = ((SkrivInnTraad) input).input;
            if (utTekst.equals("quit")) {
                fortsette = false;
            }
            ((SkrivUtTraad) output).setOutput(utTekst);
        }
    }
}
