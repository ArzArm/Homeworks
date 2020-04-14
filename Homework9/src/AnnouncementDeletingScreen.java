import java.util.ArrayList;

public class AnnouncementDeletingScreen extends Screen {
    @Override
    public Screen process() {
        ArrayList<Announcement> all = announcementRepository.getAll();
        if (all.size() == 0) {
            System.out.println("No any announcement!");
            return new AdminAnnouncementsScree();
        } else {
            System.out.println("Delete announcement: [1]");
            System.out.println("Back:  [2]");
            int i = getIntegerFromUser();
            if (i == 1) {
                System.out.println("Input announcement's number which you want to delete!");
                int announcementNumber = getIntegerFromUser();
                if (all.size() < announcementNumber) {
                    System.out.println("Wrong number!");
                    return new AnnouncementDeletingScreen();
                } else {

                    announcementRepository.getAll().remove((announcementNumber));
                    System.out.println("Announcement was deleted!");
                    return new AdminAnnouncementsScree();

                }
            } else if (i == 2) {
                return new AdminHomeScreen();
            } else {
                System.out.println("Wrong input!");
                return new AdminHomeScreen();
            }

        }

    }
}

