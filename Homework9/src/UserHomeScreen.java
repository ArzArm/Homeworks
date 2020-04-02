public class UserHomeScreen extends Screen {
    public void process() {
        while (true) {
            if (!loggedInUser.getUsername().equals(administrator.getUsername())) {
                System.out.println("Announcements:  [1]");
                System.out.println("Messages: [3]");
                System.out.println("Log Out:  [2]");
            }
            if (loggedInUser.getUsername().equals(administrator.getUsername())) {
                System.out.println("Announcements:  [1]");
                System.out.println("Edit announcements:  [4]");
                System.out.println("Log Out:  [2]");
            } else if (!loggedInUser.announcementSeen && announcements.size() != 0) {
                System.out.println("You have new announcement!");
                for (Announcement announcement : announcements) {
                    if (!loggedInUser.announcementsSeen.contains(announcement)) {
                        System.out.println((announcements.indexOf(announcement) + 1) + ". " + announcement.getAnnouncement());
                        loggedInUser.announcementsSeen.add(announcement);
                        loggedInUser.announcementSeen = true;
                    }
                }
            } else if (loggedInUser.announcementSeen || announcements.size() == 0) {
                System.out.println("No new announcement");
            }
            int i = getIntegerFromUser();
            if (i == 3) {
                UserMessagesScreen userMessagesScreen = new UserMessagesScreen();
                userMessagesScreen.process();
                break;
            } else if (i == 2) {
                System.out.println("Logged out");
                loggedInUser = null;
                StartScreen startScreen = new StartScreen();
                startScreen.process();
            } else if (i == 4) {
                AnnouncementsEditingScreen announcementsEditingScreen = new AnnouncementsEditingScreen();
                announcementsEditingScreen.process();
                break;
            } else if (i == 1) {
                AnnouncementsShowingScreen announcementsShowingScreen = new AnnouncementsShowingScreen();
                announcementsShowingScreen.process();
            } else {
                System.out.println("Wrong input");
            }
        }
    }
}
