public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        System.out.println(year);
        countLeap(year);
    }
    private static void countLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Podany rok jest przestepny.");
        } else {
            System.out.println("Podany rok nie jest przestepny.");

        }
    }
}