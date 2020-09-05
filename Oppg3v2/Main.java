package Oppg3v2;

public class Main {

	public static void main(String[] args) {

		Rutsjebane rb = new Rutsjebane();
		
		Kokk kokk1 = new Kokk(rb, 1);
		Kokk kokk2 = new Kokk(rb, 2);
		Kokk kokk3 = new Kokk(rb, 3);
		
		Servitor servitor1 = new Servitor(rb, 1);
		Servitor servitor2 = new Servitor(rb, 2);
		
		kokk1.start();
		kokk2.start();
		kokk3.start();
		
		servitor1.start();
		servitor2.start();
		
		
	}

}
