import java.util.ArrayList;

public class UserRepository {
    private ArrayList<RegularUser> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    public void save(RegularUser user) {
        users.add(user);
    }

    public boolean checkIfExistsByUsername(String username) {
        for (RegularUser user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public RegularUser getByUsername(String username) {
        for (RegularUser user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
    public RegularUser getByUsernamePassword(String username, String password) {
        for (RegularUser user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
    public ArrayList<RegularUser> getAll() {
        return users;
    }
    public void printUsersExceptOne (RegularUser someUser){
        for (RegularUser user : users) {
            if(!user.equals(someUser)){
                System.out.println(user.getUsername());
            }
        }
    }
}
