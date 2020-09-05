package Oppg3v2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Rutsjebane {
	BlockingQueue<Integer> rbane = new LinkedBlockingQueue<>();
	private int burgerNr = 1;

	public int leggTilBurger() {
		try {
			rbane.put(burgerNr);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		burgerNr++;
		return burgerNr - 1;
	}

	public int taUtBurger() {
		int i = 0;
		try { //kan evt ha throws exception
			i = rbane.take();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return i;
	}

	public boolean erFull() {
		return rbane.size() == 5;
	}

	public boolean erTom() {
		return rbane.isEmpty();
	}

	@Override
	public String toString() {
		String str = "[";
		for (int i = 0; i < rbane.size(); i++) {
			if (i == rbane.size() - 1) { // om køa e berre 1 burger eller siste
				str += "(" + rbane.toArray()[i] + ")";
			} else { // alle i midten
				str += "(" + rbane.toArray()[i] + "), ";
			}
		}
		return str + "]";
	}

}
