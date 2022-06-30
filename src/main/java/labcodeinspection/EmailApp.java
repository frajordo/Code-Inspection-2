package labcodeinspection;

import java.util.Scanner;

/**
 * Main class, contains hole logic
 * @author Marck
 *
 */
public class EmailApp {
	
	/**
	 * Main method, starts the system
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = sc.nextLine();

		System.out.print("Enter your last name: ");
		String lastName = sc.nextLine();

		System.out.print("\nDEPARTMENT CODE\n1. for sales\n2. for Development\n3. for accounting\nEnter code: ");

		int depChoice = sc.nextInt();
		sc.close();

		Email email = new Email(firstName, lastName);
		email.setDeparment(depChoice);
		email.generateEmail();
		email.showInfo();
	}
	
	/**
	 * Void contructor to avoid UseUtilityClass
	 */
	private EmailApp() {
	}
}
