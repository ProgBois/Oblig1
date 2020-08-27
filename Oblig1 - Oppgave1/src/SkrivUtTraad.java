public class SkrivUtTraad extends Thread {

    public String output = "Hallo Veden!";
    private Boolean fortsette = true;

    @Override
    public void run() {
        while (fortsette) {
            if (output.equals("quit")) {
                fortsette = false;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!output.equals("quit")) {
                System.out.println(output);
            }
        }
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
