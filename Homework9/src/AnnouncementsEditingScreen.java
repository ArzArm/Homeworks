public class AnnouncementsEditingScreen extends Screen {
    @Override
    public void process() {
        while (true) {
            System.out.println("Crate announcement: [1]");
            System.out.println("Delete announcement: [2]");
            System.out.println("Back:  [3]");
            int i = getIntegerFromUser();
            if (i == 1) {
                System.out.println("Write announcement!");
                String announcement = getStringFromUser();
                Announcement announcement1 = new Announcement(announcement);
               for (User user : userRepository.getAll()) {
                    user.announcementSeen = false;
                }
                administrator.getAnnouncements().add(announcement1);
                System.out.println("Announcement published!");
            } else if (i == 2) {
                System.out.println("Input announcement's number which you want to delete");
                int announcementNumber = getIntegerFromUser();
                if (administrator.getAnnouncements().size() < announcementNumber) {
                    System.out.println("Wrong number!!!");
                    break;
                } else {
                    administrator.announcements.remove((announcementNumber - 1));
                    System.out.println("Announcement is deleted");
                }
            } else if (i == 3) {
                UserHomeScreen userHomeScreen = new UserHomeScreen();
                userHomeScreen.process();
            } else {
                System.out.println("Wrong input!!");
            }
        }
    }
}
