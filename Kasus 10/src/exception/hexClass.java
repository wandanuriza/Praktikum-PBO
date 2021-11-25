package exception;

import java.util.Scanner;

public class hexClass {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        boolean isValid = false;
        String hex = "";
        int decimal = 0;
        while (!isValid) {
            try {
                System.out.print("Enter a hex number: ");
                hex = input.nextLine();
                decimal = hexToDecimal(hex);
                isValid = true;
            } catch (NumberFormatException ex) {
                System.out.println(ex.getLocalizedMessage());
                System.out.println("Try again...");
            }

        }
        System.out.println("The decimal value for hex number "
                + hex + " is " + decimal);
	}
} // belum selesai
