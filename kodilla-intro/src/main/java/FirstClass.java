public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2016);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();

        Notebook greyNotebook = new Notebook(2000, 1500, 2020);
        System.out.println(greyNotebook.weight + " " + greyNotebook.price + " " + greyNotebook.year);
        greyNotebook.checkPrice();

        Notebook blackNotebook = new Notebook(1600, 500,2018);
        System.out.println(blackNotebook.weight + " " + blackNotebook.price + " " + blackNotebook.year);
        blackNotebook.checkPrice();

        Notebook littleNotebook = new Notebook(600, 1000,2016);
        System.out.println(littleNotebook.weight + " " + littleNotebook.price + " " + littleNotebook.year);
        littleNotebook.checkWeight();

        Notebook largeNotebook = new Notebook(2000, 1500,2019);
        System.out.println(largeNotebook.weight + " " + largeNotebook.price + " " + largeNotebook.year);
        largeNotebook.checkWeight();

        Notebook midNotebook = new Notebook(1600, 500, 2020);
        System.out.println(midNotebook.weight + " " + midNotebook.price + " " + midNotebook.year);
        midNotebook.checkWeight();

        Notebook firstNotebook = new Notebook(600, 1000,2016);
        System.out.println(firstNotebook.weight + " " + firstNotebook.price + " " + firstNotebook.year);
        firstNotebook.checkYear();

        Notebook secondNotebook = new Notebook(2000, 1500,2019);
        System.out.println(secondNotebook.weight + " " + secondNotebook.price + " " + secondNotebook.year);
        secondNotebook.checkYear();

        Notebook thirdNotebook = new Notebook(1600, 500, 2020);
        System.out.println(thirdNotebook.weight + " " + thirdNotebook.price + " " + thirdNotebook.year);
        thirdNotebook.checkYear();

        Notebook pinkNotebook = new Notebook(600, 1800,2016);
        System.out.println (pinkNotebook.price + " " + firstNotebook.year);
        pinkNotebook.checkYearAndPrice();

        Notebook redNotebook = new Notebook(2000, 1500,2019);
        System.out.println(redNotebook.price + " " + redNotebook.year);
        redNotebook.checkYearAndPrice();

        Notebook greenNotebook = new Notebook(1600, 500, 2020);
        System.out.println(greenNotebook.price + " " + greenNotebook.year);
        greenNotebook.checkYearAndPrice();
    }
}