import java.util.ArrayList;

public class AdminAnnouncementsScree extends Screen {

    public Screen process() {

        ArrayList<Announcement> all = announcementRepository.getAll();
        if (all.size() == 0) {
            System.out.println("No any announcement!");
        } else {
            System.out.println("All announcements!");

            for (Announcement announcement : all) {
                System.out.println(announcement + ".  (" + announcement.getSequentialNumber() + ")");
            }
        }
        System.out.println("Crate announcement:  [1]");
        System.out.println("Delete announcement:  [2]");
        System.out.println("Back:  [3]");
        System.out.println("Log out: [0]");
        int i = getIntegerFromUser();
        if (i == 1) {
            return new AnnouncementsCratingScreen();
        } else if (i == 2) {
            return new AnnouncementDeletingScreen();

        } else if (i == 3) {
            return new AdminHomeScreen();
        } else if (i == 0) {
            return new StartScreen();
        } else {
            System.out.println("Wrong input!");
            return new AdminAnnouncementsScree();
        }
    }
}
