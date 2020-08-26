package User;

public class TypeOfUser {
    private String name;
    private double age;
    private double height;

    public String getName() {
        return this.name;
    }

    public double getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    public TypeOfUser(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}