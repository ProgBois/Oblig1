public class SkrivUtTraad extends Thread {

    Melding melding;
    private Boolean fortsette = true;

    public SkrivUtTraad(Melding melding) {
        this.melding = melding;
    }

    @Override
    public void run() {
        while (fortsette) {
            if (melding.getTekst().equals("quit")) {
                fortsette = false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!melding.getTekst().equals("quit")) {
                System.out.println(melding.getTekst());
            }
        }
    }
}
