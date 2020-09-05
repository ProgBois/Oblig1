package Oppg3v2;

import java.util.Random;

public class Kokk extends Thread {
	private Rutsjebane rutsjebane;
	private int kokkNr;
	private Random r = new Random();

	public Kokk(Rutsjebane rutsjebane, int kokkNr) {
		this.rutsjebane = rutsjebane;
		this.kokkNr = kokkNr;
	}

	@Override
	public void run() {
		int rnd = ((r.nextInt(4) + 2) * 1000);
		
		while (true) {
			try {
				Thread.sleep(rnd);
				if (!rutsjebane.erFull()) {
					int burgerNr = rutsjebane.leggTilBurger();
					System.out.println(
							"Kokk" + kokkNr + " Legger på burger (" + burgerNr + ") >> " + rutsjebane.toString());
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
