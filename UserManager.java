import java.util.ArrayList;

public class UserManager {
    public ArrayList<User> registeredUsers = new ArrayList();
    public User registerUser(String username) {
        User user = new User(username);
        registeredUsers.add(user);
        return user;
    }
    public User findByUsername(String username) {
        for (int i = 0; i < registeredUsers.size(); i++) {
       if( registeredUsers.get(0).getName()==username ){
           return registeredUsers.get(i);
       }
        }
        return null;
    }

    public ArrayList<User> getRegisteredUsers() {
        return registeredUsers;
    }
}
