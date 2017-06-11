package jetapp;

import java.util.Scanner;

public class JetAppDriver {
	Scanner kb = new Scanner(System.in);
	AircraftCarrier carrier = new AircraftCarrier();

	public void startJetApp() {
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
			carrier.addJetToFleet();
			break;
			
		case 5:
			System.out.println("Thank you for using JetApp 1.0/n Quitting!");
			return true;

		}
		return false;
	}

	public void listFleet() {

	}

	public void viewFastestJet() {

	}

	public void viewLongestRange() {

	}
}
