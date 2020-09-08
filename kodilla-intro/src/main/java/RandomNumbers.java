import java.util.Random;
import java.util.concurrent.LinkedTransferQueue;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rnd = new Random();
        int random = 0;
        int suma = 0;
        int min = 30;
        int max = 0;

        while (suma < 5000) {
            random = rnd.nextInt(31);
            suma += random;
        }
//        private static int getMinRandom() {
//            Random MIN = new Random();
//            if (random < min) min = random;
//            System.out.println("Min:" + min);
//        }
//        public static int getMaxRandom() {
//            Random MAX = new Random();
//            if (random > max) max = random;
//            System.out.println("Max:" + max);
//        }
    }
}