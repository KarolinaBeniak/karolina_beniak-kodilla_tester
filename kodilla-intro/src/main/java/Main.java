import java.util.Random;

public class Main {
    private int suma;
    private int random;
    private MinMax minmax;
    private Random rnd;

    public Main() {
        minmax = new MinMax(0,30);
        rnd = new Random();
    }
    private MinMax losowanie(){
        while(suma<5000){
            random = rnd.nextInt(31);
            if (random<minmax.getMinimum()){
                minmax.setMinimum(random);
            }
            if (random>minmax.getMaksimum()){
                minmax.setMaksimum(random);
            }
            suma+=random;
        }
        return minmax;
    }
    public void display(){
        System.out.println(losowanie().toString());
    }

    public static void main(String[] args) {
        Main zadanie = new Main();
        zadanie.display();
    }
}
