public class AnnouncementsEditingScreen extends Screen {
    @Override
    public Screen process() {
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
            announcements.add(announcement1);
            System.out.println("Announcement was published!");
            return new AnnouncementsEditingScreen();
        } else if (i == 2) {
            if (announcements.size() == 0) {
                System.out.println("No any announcement!");
                return new AnnouncementsEditingScreen();
            } else {
                System.out.println("Input announcement's number which you want to delete!");
                int announcementNumber = getIntegerFromUser();
                if (announcements.size() < announcementNumber) {
                    System.out.println("Wrong number!");
                    return new AnnouncementsEditingScreen();
                } else {
                    announcements.remove((announcementNumber - 1));
                    System.out.println("Announcement was deleted!");
                    return new AnnouncementsEditingScreen();
                }
            }
        } else if (i == 3) {
            return new AdminHomeScreen();
        } else {
            System.out.println("Wrong input!");
            return new AnnouncementsEditingScreen();
        }
    }
}
