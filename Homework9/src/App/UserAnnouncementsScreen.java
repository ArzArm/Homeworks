package App;
import java.util.ArrayList;

public class UserAnnouncementsScreen extends Screen {

    @Override
    public Screen process() {
        ArrayList<Announcement> all = announcementRepository.getAll();
        if (all.size() == 0) {
            System.out.println("No any announcement!");
        } else {
            System.out.println("All announcements!");

            for (Announcement announcement : all) {
                System.out.println(announcement);
            }
        }

        System.out.println("Back:  [1]");
        System.out.println("Log out: [0]");
        int i = getIntegerFromUser();
        if (i == 1) {
            return new UserHomeScreen();
        } else if (i == 0) {
            return new StartScreen();
        } else {
            System.out.println("Wrong input!");
            return new UserAnnouncementsScreen();
        }
    }
}
