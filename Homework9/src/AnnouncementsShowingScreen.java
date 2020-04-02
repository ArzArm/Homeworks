public class AnnouncementsShowingScreen extends Screen {

    public void process (){
        if (administrator.getAnnouncements().size() == 0) {
            System.out.println("No any announcement");
        } else {
            System.out.println("All announcements:");
            for (Announcement announcement : administrator.getAnnouncements()) {
                System.out.println((administrator.getAnnouncements().indexOf(announcement) + 1) + ". " + announcement.getAnnouncement());
            }
        }
        System.out.println("Back:  [1]");
        System.out.println("Log out: [2]");
        int i = getIntegerFromUser();
        if (i == 1) {
            UserHomeScreen userHomeScreen = new UserHomeScreen();
            userHomeScreen.process();
        } else if (i == 2) {
            StartScreen startScreen = new StartScreen();
            startScreen.process();;
        } else {
            System.out.println("Wrong input");
        }

    }
}
