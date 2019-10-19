package Lesson8.Application;
import java.util.*;


public class UserService {
    private Map<String,User> users;

    public UserService() {
        users = new HashMap<>();
        User adminUser = new User("admin","admin", "Egor");
        users.put("admin",adminUser);
    }

    public User getByLogin (String login){
        if(users.containsKey(login)) {
            System.out.println(users.get(login));
        }
        return users.get(login);
    }

    public boolean addUser(String login, User user){
        if (users.get(login) == null) {
            users.put(login, user);
            return true;
        } else {
            return false;
        }
    }

    public boolean deleteByLogin (String login){
        if(users.containsKey(login)){
            users.remove(login);
            return true;
        } else {
            return false;
        }
    }

    public List<User> getAllUser() {
        System.out.println(users.values());
        return new ArrayList<>(users.values());
    }

    public boolean editUser (User user){
        for (Map.Entry<String, User> pair: users.entrySet()) {
            if(pair.getKey().equals(user.getLogin())) {
                users.remove(user.getLogin());
                users.put(user.getLogin(),user);
                System.out.println("The data of the Union member has been successfully changed");
                return true;
            }
        }
        return false;
    }
    public boolean auth(String login, String password){
        if(users.containsKey(login)){
            User user = users.get(login);
            if(user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    public boolean searchUser(String login){
        for (Map.Entry<String, User> pair: users.entrySet()) {
            if(pair.getKey().equals(login)) {
                return true;
            }
        }
        System.out.println("A member not found");
        return false;
    }

}
