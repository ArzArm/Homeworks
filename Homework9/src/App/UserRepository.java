package App;
import java.util.ArrayList;

public class UserRepository implements Repository<RegularUser>{
    private ArrayList<RegularUser> users;
    private static int lastIndex = 0;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    public void save(RegularUser user) {
        if (user == null) {
            throw new IllegalArgumentException("User must not be null");
        }
        lastIndex ++;
        user.setLastReadSequentialNumber(lastIndex);
        user.setId(lastIndex);
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
            if(user.getId() != someUser.getId()){
                System.out.println(user.getUsername());
            }
        }
    }

}
