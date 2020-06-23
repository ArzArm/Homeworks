public class AnnouncementsCratingScreen extends Screen {
    @Override
    public Screen process() {
        System.out.println("Crate announcement: [1]");
        System.out.println("Back:  [2]");
        int i = getIntegerFromUser();
        if (i == 1) {
            System.out.println("Write announcement!");
            String announcement = getStringFromUser();
            Announcement announcement1 = new Announcement(announcement);
            announcementRepository.save(announcement1);
            System.out.println("Announcement created!");
            return new AnnouncementsCratingScreen();
        } else if (i == 2) {
            return new AdminHomeScreen();
        } else {
            System.out.println("Wrong input!");
            return new AnnouncementsCratingScreen();
        }
    }
}
