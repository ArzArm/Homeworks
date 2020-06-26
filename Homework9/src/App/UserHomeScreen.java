package App;
import java.util.ArrayList;

public class UserHomeScreen extends Screen {
    public Screen process() {
        System.out.println("Announcements:  [1]");
        System.out.println("Messages: [2]");
        System.out.println("Friendship:  [3]");
        System.out.println("Change password: [4]");
        System.out.println("Log Out:  [0]");
        int lastReadSequentialNumber = loggedInUser.getLastReadSequentialNumber();
        ArrayList<Announcement> allAnnouncements = announcementRepository.getAll();
        if (lastReadSequentialNumber < allAnnouncements.size() - 1) {
            System.out.println("You have new announcement!");
            for (int i = lastReadSequentialNumber + 1; i < allAnnouncements.size(); i++) {

                System.out.println(allAnnouncements.get(i));
            }
            loggedInUser.setLastReadSequentialNumber(allAnnouncements.size() - 1);

        } else {
            System.out.println("No new announcement!");
        }

        int i = getIntegerFromUser();
        if (i == 2) {
            return new UserMessagesScreen();
        } else if (i == 0) {
            System.out.println("Logged out!");
            loggedInUser = null;
            return new StartScreen();
        } else if (i == 1) {
            return new UserAnnouncementsScreen();
        } else if (i == 3) {
            return new FriendshipScreen();
        } else if (i == 4) {
            System.out.println("Insert your old password!");
            String oldPassword = getStringFromUser();
            if (loggedInUser.getPassword().equals(oldPassword)) {
                System.out.println("Insert new password!");
                String newPassword = getStringFromUser();
                loggedInUser.setPassword(newPassword);
                System.out.println("Your password was changed!");
            } else {
                System.out.println("Wrong password!");
            }
            return new UserHomeScreen();
        } else {
            System.out.println("Wrong input!");
            return new UserHomeScreen();
        }
    }
}
