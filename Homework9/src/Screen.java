import java.util.ArrayList;
import java.util.Scanner;

public abstract class Screen {
    private static Scanner scannerInt = new Scanner(System.in);
    private static Scanner scannerString = new Scanner(System.in);

    protected static RegularUser loggedInUser = null;
    protected static UserRepository userRepository = new UserRepository();
    protected static AnnouncementRepository announcementRepository = new AnnouncementRepository();
    protected static MassageRepository messageRepository = new MassageRepository();
    protected static Admin admin = new Admin();

    protected int getIntegerFromUser() {
        try{
            String stringFromUser = getStringFromUser();
            return Integer.parseInt(stringFromUser);
        } catch (NumberFormatException e){
            return Integer.MIN_VALUE;
        }

        //return scannerInt.nextInt();
    }

    protected String getStringFromUser()
    {
        return scannerString.nextLine();
    }

    public abstract Screen process();


}