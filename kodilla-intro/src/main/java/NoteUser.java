public class NoteUser {

    public static void main(String[] args) {

        User user1 = new User("Anna", 22);
        User user2 = new User("Beata", 33);
        User user3 = new User("Carl", 58);
        User user4 = new User("Adam", 13);
        User user5 = new User("Eva", 18);
        User user6 = new User("Frankie", 45);

        User[] tablicaUser = new User[6];

        tablicaUser[0] = user1;
        tablicaUser[1] = user2;
        tablicaUser[2] = user3;
        tablicaUser[3] = user4;
        tablicaUser[4] = user5;
        tablicaUser[5] = user6;

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