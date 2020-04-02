
import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private ArrayList<Message> messages;
    private ArrayList<Announcement> announcementsSeen;
    protected ArrayList<Announcement> announcements;
    boolean announcementSeen = false;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        messages = new ArrayList<>();
        announcementsSeen = new ArrayList<>();
        announcements = new ArrayList<>();
    }

    public ArrayList<Announcement> getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(ArrayList<Announcement> announcements) {
        this.announcements = announcements;
    }

    public ArrayList<Announcement> getAnnouncementsSeen() {
        return announcementsSeen;
    }

    public void setAnnouncementsSeen(ArrayList<Announcement> announcementsSeen) {
        this.announcementsSeen = announcementsSeen;
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

    public ArrayList<Message> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}