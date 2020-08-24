public class MinMax {
    private int maksimum;
    private int minimum;

    public MinMax(int max, int min) {
        this.maksimum = max;
        this.minimum = min;
    }

    public int getMaksimum() {
        return maksimum;
    }

    public void setMaksimum(int maksimum) {
        this.maksimum = maksimum;
    }

    public int getMinimum() {
        return minimum;
    }

    public void setMinimum(int minimum) {
        this.minimum = minimum;
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "maksimum=" + maksimum +
                ", minimum=" + minimum +
                '}';
    }
}
