package Switche;

import java.util.Scanner;

public class Colour {

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
