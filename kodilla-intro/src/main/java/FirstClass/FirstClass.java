package FirstClass;

public class FirstClass {
    public static void main(String[] args) {
        yearsNotebook(500, 1800, 2016);
        yearsNotebook(2000, 1500, 2019);
        yearsNotebook(1600, 500, 2020);
        pricesNotebook(600, 1900, 2019);
        pricesNotebook(2000, 1500, 2019);
        pricesNotebook(1600, 600, 2020);
        weightsNotebook(1600, 500, 2020);
        weightsNotebook(2000, 1500, 2020);
        weightsNotebook(600, 1000, 2018);
        processNotebook(1600, 500, 2020);
        processNotebook(700, 1900, 2019);
        processNotebook(900, 1800, 2016);
    }
    private static void yearsNotebook(int weight, int price, int year) {
        Notebook notebook = new Notebook(weight, price, year);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkYear();
    }
    private static void pricesNotebook(int weight, int price, int year) {
        Notebook notebook = new Notebook(weight, price, year);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();
    }
    private static void weightsNotebook(int weight, int price, int year) {
        Notebook notebook = new Notebook(weight, price, year);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkWeight();
    }
    private static void processNotebook(int weight, int price, int year) {
        Notebook notebook = new Notebook(weight, price, year);
        System.out.println(notebook.price + " " + notebook.year);
        notebook.checkYearAndPrice();
    }
}