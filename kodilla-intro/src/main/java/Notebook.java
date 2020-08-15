public class Notebook {
        int weight;
        int price;
        int year;

        public Notebook(int weight, int price, int year) {
                this.weight = weight;
                this.price = price;
                this.year = year;
        }

        public void checkPrice() {
                if (this.price < 600) {
                        System.out.println("This notebook is cheap.");
                } else if (this.price > 600 && this.price < 1000) {
                        System.out.println("This price is very good");
                } else {
                        System.out.println("This notebook is quite expensive.");
                }
        }

        public void checkWeight() {
                if (this.weight < 600) {
                        System.out.println("This device is very slight");
                } else if (this.weight > 600 && this.weight < 2000) {
                        System.out.println("This device is not too heavy");
                } else {
                        System.out.println("This device is very heavy");

                }
        }
        public void checkYear() {
                if (this.year < 2016) {
                        System.out.println("Notebook is very old");
                } else if (this.year > 2016 && this.year < 2019) {
                        System.out.println("Notebook is modern");
                } else {
                        System.out.println("Notebook is the latest");
                }
        }
        public void checkYearAndPrice() {
                if (this.year < 2017 && this.price > 1500) {
                        System.out.println("This is bad choice");
                } else if (this.year > 2019 && this.price < 1000) {
                        System.out.println("The best choice!");
                } else {
                        System.out.println("Good choice");
                }
        }
}
