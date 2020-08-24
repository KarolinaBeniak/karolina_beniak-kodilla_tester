package Switche;

import java.util.Scanner;

public class Colour {
    public static String getFirstLetter() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the first letter of the colour:");
            String colour = scanner.nextLine().trim();
            if (colour.length() == 1) {
                return colour;
            }
            System.out.println("Only one letter. Please, try again.");
        }
    }

    public static String getUserChoose() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select colour (B - blue, P - pink, Y - yellow  ,W - white):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "B": return "BLUE";
                case "P": return "PINK";
                case "Y": return "YELLOW";
                case "W": return "WHITE";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }
}
