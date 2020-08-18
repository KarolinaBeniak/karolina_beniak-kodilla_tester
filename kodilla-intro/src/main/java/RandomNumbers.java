import java.util.Random;

public class RandomNumbers {
    int maxNumber=5000;
    int minNumber=0;
    int suma=0;

    private static int randomNumbers() {
        Random random = new Random();
        int number = 0;


        for (int i = number + number; i < 5001; i++) {
            int randomNumber = random.nextInt(31);
            number = randomNumber;
        }
        return number;
        if ()
    }
    private static int maxValue() {
        int this.maxNumber = maxNumber;
        int numbersRandom = randomNumbers();
        if (this.maxNumber<=numbersRandom) {
            this.maxNumber = numbersRandom;
        }
        return maxNumber;
    }
    private static int minValue() {
        int numbersRandom = randomNumbers();
        if (this.minNumber>numbersRandom) {
            this.minNumber = numbersRandom;
        }
        return minValue;
    }
    public static void main(String[] args) {
        System.out.println(maxValue());
        System.out.println(minValue());
    }
}
}

