
import java.util.ArrayList;

public class User {
    private String username;
    private String password;

    protected  ArrayList<Announcement> announcementsSeen;
    protected ArrayList<Message> newMessage;
    boolean announcementSeen = false;
    boolean haveNewMessage = false;
    protected ArrayList<User> requests;
    protected ArrayList<User> friends;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        announcementsSeen = new ArrayList<>();
        newMessage = new ArrayList<>();
        friends = new ArrayList<>();
        requests = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}