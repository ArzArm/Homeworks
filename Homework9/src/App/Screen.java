package App;
import java.util.Scanner;

public abstract class Screen {
    private static Scanner scanner = new Scanner(System.in);

    protected static RegularUser loggedInUser = null;
    protected static UserRepository userRepository = new UserRepository();
    protected static AnnouncementRepository announcementRepository = new AnnouncementRepository();
    protected static MassageRepository messageRepository = new MassageRepository();
    protected static FriendRepository friends = new FriendRepository();
    protected static FriendshipRequestRepository friendshipRequestRepository = new FriendshipRequestRepository();

    protected static Admin admin = new Admin();

    protected int getIntegerFromUser() {
        try{
            String stringFromUser = getStringFromUser();
            return Integer.parseInt(stringFromUser);
        } catch (NumberFormatException e){
            return Integer.MIN_VALUE;
        }


    }

    protected String getStringFromUser()
    {
        return scanner.nextLine();
    }

    public abstract Screen process();


}