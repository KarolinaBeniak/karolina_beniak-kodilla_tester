package User;
public class UserApplication {
    public static void main(String[] args) {
        TypeOfUser app = new TypeOfUser("Adam", 15, 178);
        if (app.getName() != null) {
            if (app.getAge() > 30 && app.getHeight() > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }
}