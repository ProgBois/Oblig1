package Oppg3v2;

import java.util.Random;

public class Servitor extends Thread {
	private int servNr;
	Rutsjebane rutsjebane;
	Random r = new Random();

	public Servitor(Rutsjebane rutsjebane, int servNr) {
		this.rutsjebane = rutsjebane;
		this.servNr = servNr;
	}

	@Override
	public void run() {
		int rnd = ((r.nextInt(4) + 2) * 1000);
		while (true) {
			try {
				Thread.sleep(rnd);
				if (!rutsjebane.erTom()) {
					int burgerNr = rutsjebane.taUtBurger();
					System.out.println(
							"Servitør" + servNr + " Tar av burger (" + burgerNr + ") >> " + rutsjebane.toString());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
