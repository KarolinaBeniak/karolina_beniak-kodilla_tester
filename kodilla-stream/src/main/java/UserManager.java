import java.util.List;
import java.util.stream.Collectors;

public class UserManager {
    public static void main(String[] args) {
        List<String> usernames = UserRepository.getUserList()
                .stream()
                .filter(u-> u.getGroup().equals("Chemists"))
                .map(UserManager :: getUserName)
                .collect(Collectors.toList());
        System.out.println(usernames);
    }

    public static String getUserName(User user){
        return user.getUsername();
    }
}
