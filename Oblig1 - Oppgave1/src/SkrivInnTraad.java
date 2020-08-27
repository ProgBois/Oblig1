import javax.swing.*;

public class SkrivInnTraad extends Thread {

    Melding melding;
    private Boolean fortsette = true;

    public SkrivInnTraad(Melding melding) {
        this.melding = melding;
    }

    @Override
    public void run() {
        while (fortsette) {
            melding.setTekst(JOptionPane.showInputDialog("Input? Skriv \"quit\" for å avslutte"));
            if (melding.getTekst().equals("quit")) {
                fortsette = false;
            }
        }
    }
}
