import java.util.ArrayList;
import java.util.Scanner;

public abstract class Screen {
    private static Scanner scanner = new Scanner(System.in);
    protected static User loggedInUser = null;
    protected static User administrator = new User("admin", "123");
    protected static UserRepository userRepository = new UserRepository();
    protected static ArrayList<Announcement> announcements  = new ArrayList<>();


    protected int getIntegerFromUser(){
        return scanner.nextInt();
    }
    protected String getStringFromUser(){
        return scanner.next();
    }
    public abstract void process();
}
