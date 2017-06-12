package jetapp;

import java.util.Scanner;

public class AircraftCarrier {
	Scanner kb = new Scanner(System.in);
	Jet[] jets = new Jet[100];

	public void currentFleet() {

		jets[3] = new Jet("F-4 Phantom II", 1473.00f, 1615, 2_400_000.00F);
		jets[1] = new Jet("A-10 Warthog", 439.00f, 800, 18_800_000.00F);
		jets[2] = new Jet("F-18 Hornet", 1190.00f, 2069, 98_000_000.00F);
		jets[4] = new Jet("F-22 Raptor", 1498.00f, 1839, 150_000_000.00F);
		jets[0] = new Jet("F-35C Lightning II", 1197.00f, 1400, 122_000_000.00F);
	}

	public void addJetToFleet() {
		System.out.println("Enter the jet model: ");
		String model = kb.next();
		System.out.println("Enter the jet speed(MPH): ");
		float speed = kb.nextFloat();
		System.out.println("Enter the flight range(Miles): ");
		int range = kb.nextInt();
		System.out.println("Enter the price of jet: $");
		double price = kb.nextDouble();
		Jet[] temp = new Jet[jets.length + 1];
		for (int i = 0; i < jets.length; i++) {
			temp[i] = jets[i];
		}
		temp[jets.length] = new Jet(model, speed, range, price);
		jets = temp;
	}
}
