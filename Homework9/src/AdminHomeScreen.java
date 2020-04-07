public class AdminHomeScreen extends Screen {

    @Override
    public Screen process() {
        System.out.println("Announcements:  [1]");
        System.out.println("Edit announcements:  [2]");
        System.out.println("Log Out:  [0]");
        int i = getIntegerFromUser();

        if (i == 1) {
            return new AnnouncementsShowingScreen();
        } else if (i == 2) {
            return new AnnouncementsEditingScreen();
        } else if (i == 0) {
            return new StartScreen();
        } else {
            System.out.println("Wrong input!");
            return new AdminHomeScreen();
        }
    }
}
