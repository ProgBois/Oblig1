import javax.swing.*;

public class SkrivInnTraad extends Thread {

    public String input = "Hallo Verden!";
    private Boolean fortsette = true;

    @Override
    public void run() {
        while (fortsette) {
            input = JOptionPane.showInputDialog("Input? Skriv \"quit\" for å avslutte");
            if (input.equals("quit")) {
                fortsette = false;
            }
        }
    }
}
