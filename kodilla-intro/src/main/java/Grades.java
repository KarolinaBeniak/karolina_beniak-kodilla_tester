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
    public double averageGrades() {
            double addElementsTab = 0.0;
            int sizeTab = grades.length;

            for (int i : grades) {
                addElementsTab += i;
            }
            return (sizeTab == 0) ? 0 : addElementsTab/sizeTab;
        }
        public void showGrades() {
            for (int i=0; i < grades.length; i++) {
                System.out.println(i + " : " + grades[i]);
            }
    }
}
