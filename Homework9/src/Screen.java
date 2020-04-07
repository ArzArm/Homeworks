import java.util.ArrayList;
import java.util.Scanner;

public abstract class Screen {
    private static Scanner scannerInt = new Scanner(System.in);
    private static Scanner scannerString = new Scanner(System.in);

    protected static User loggedInUser = null;
    protected static User administrator = new User("admin", "123");
    protected static UserRepository userRepository = new UserRepository();
    protected static ArrayList<Announcement> announcements = new ArrayList<>();
    protected static ArrayList<Message> messages = new ArrayList<>();

    protected int getIntegerFromUser() {

        return scannerInt.nextInt();
    }

    protected String getStringFromUser()
    {
        return scannerString.nextLine();
    }

    public abstract Screen process();


}