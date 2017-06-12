package jetapp;

import java.util.Scanner;

public class JetAppDriver {
	Scanner kb = new Scanner(System.in);
	JetMenu menu = new JetMenu();
	private Jet[] jets = new Jet[5];

	public void startJetApp() {
		menu.menuOptions();
		jetAppMenuInput();
	}

	private void jetAppMenuInput() {
		boolean quitApp = false;

		while (!quitApp) {
			System.out.println("Enter your choice: ");
			int userInput = kb.nextInt();
			quitApp = userChoice(userInput);
		}

	}

	private boolean userChoice(int choice) {

		switch (choice) {

		case 1:
			listFleet();
			break;

		case 2:
			viewFastestJet();
			break;

		case 3:
			viewLongestRange();
			break;

		case 4:
			addJetToFleet();
			break;

		case 5:
			System.out.println("Thank you for using JetApp 1.0/n Quitting!");
			return true;
		default:
			System.out.println("Invalid option please try again.");
			jetAppMenuInput();

		}
		return false;
	}

	public void listFleet() {
		currentFleet();
		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {
				System.out.println(jets[i].toString());

			}
		}	

	}

	public void viewFastestJet() {
		currentFleet();
		Jet fastestJet = new Jet();

		for (int i = 0; i < jets.length; i++) {
			if (jets[i] != null) {

				if (jets[i].getSpeed() > fastestJet.getSpeed()) {
					fastestJet = jets[i];
				}
			}
		}
		System.out.println("\nFastest jet: " + fastestJet.toString()+ "\n\n");
		menu.menuOptions();

	}

	public void viewLongestRange() {

	}

	public void currentFleet() {

		jets[0] = new Jet("F-4 Phantom", 1473.00f, 1615, 2_400_000.00F);
		jets[1] = new Jet("Harrier Jump Jet", 439.00f, 800, 18_800_000.00F);
		jets[2] = new Jet("F-18 Hornet", 1190.00f, 2069, 98_000_000.00F);
		jets[3] = new Jet("F-22 Raptor", 1498.00f, 1839, 150_000_000.00F);
		jets[4] = new Jet("F-35C Lightning II", 1197.00f, 1400, 122_000_000.00F);

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
