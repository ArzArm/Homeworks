public class AnnouncementsShowingScreen extends Screen {

    public Screen process (){
        System.out.println("Back:  [1]");
        System.out.println("Log out: [0]");
        if (announcements.size() == 0) {
            System.out.println("No any announcement!");
        } else {
            System.out.println("All announcements!");
            for (Announcement announcement : announcements) {
                System.out.println((announcements.indexOf(announcement) + 1) + ". " + announcement.getAnnouncement());
            }
        }
        int i = getIntegerFromUser();
        if (i == 1 && loggedInUser == administrator) {
            return new AdminHomeScreen();
        } else if (i == 1) {
            return new UserHomeScreen();
        }
        else if (i == 0) {
            return new StartScreen();
        } else {
            System.out.println("Wrong input!");
            return new AnnouncementsShowingScreen();
        }
    }
}
