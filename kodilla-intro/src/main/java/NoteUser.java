public class NoteUser {

    public static void main(String[] args) {

        User[] tablicaUser = new User[]{
                new User("Anna", 22),
                new User("Beata", 33),
                new User("Carl", 58),
                new User("Adam", 13),
                new User("Eva", 18),
                new User("Frankie", 45),
                new User("Victor", 67),
        };

        double suma = 0;

        for (User age : tablicaUser) {
            suma = suma + age.getAge();
        }

        double average = suma / tablicaUser.length;

        for (User user : tablicaUser) {
            if (user.getAge() < average) {
                System.out.println(user.getName());
            }
        }
    }
}