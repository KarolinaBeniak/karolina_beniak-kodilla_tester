public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int grades) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = grades;
        this.size++;
    }

    public int lastGrades() {
        if (this.size == 0) {
            return 0;
        }
        return this.grades[this.size - 1];
    }
    public double averageGrades(int grades) {
            double sumTab = 0.0;
            int sizeTab = grades;

            for (double i : grades) {
                sumTab += i;
            }
            return (sizeTab == 0) ? 0 : sumTab/sizeTab;
        }
        public void showGrades() {
            for (int i=0; i < grades.length; i++) {
                System.out.println(i + " : " + grades[i]);
            }
    }
}
