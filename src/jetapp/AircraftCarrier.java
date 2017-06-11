package jetapp;

import java.util.Scanner;

public class AircraftCarrier {
	Scanner kb = new Scanner(System.in);
	Jet[] jets = new Jet[100];

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
