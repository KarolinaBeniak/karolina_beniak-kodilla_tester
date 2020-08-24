package Switche;

public class ColourApp {
    public static void main(String[] args) {
        Colour letter = new Colour();
        String nameofcolour = letter.getUserChoose();
        System.out.println("Your colour is :" + nameofcolour);
    }
}
