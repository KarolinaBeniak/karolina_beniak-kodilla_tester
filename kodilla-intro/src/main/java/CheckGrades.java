public class CheckGrades {

    public static void main(String[] args) {
        Grades grades = new Grades();

        grades.add(5);
        grades.showGrades();

        int lastGrade = grades.lastGrades();

        System.out.println(lastGrade);
    }
}
