import java.util.Random;
import java.util.concurrent.LinkedTransferQueue;

public class RandomNumbers {
    private static int random = 0;
    private static int suma = 0;
    private static int min = 30;
    private static int max = 0;

    public static void main(String[] args) {
        Random rnd = new Random();

        while (suma < 5000) {
            random = rnd.nextInt(31);
            suma += random;

            if (random < min ) {
                min = random;
            }

            if (random > max) {
                max = random;
            }
        }

        System.out.println(getMaxRandom());
        System.out.println(getMinRandom());
    }

    private static int getMinRandom() {
        return min;
    }

    private static int getMaxRandom() {
        return max;
    }

}