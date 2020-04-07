public class UserHomeScreen extends Screen {
    public Screen process() {
        System.out.println("Announcements:  [1]");
        System.out.println("Messages: [2]");
        System.out.println("Friendship request:  [3]");
        System.out.println("Change password: [4]");
        System.out.println("Log Out:  [0]");

        if (!loggedInUser.announcementSeen && announcements.size() != 0) {
            System.out.println("You have new announcement!");
            for (Announcement announcement : announcements) {
                if (!loggedInUser.announcementsSeen.contains(announcement)) {
                    System.out.println((announcements.indexOf(announcement) + 1) + ". " + announcement.getAnnouncement());
                    loggedInUser.announcementsSeen.add(announcement);
                    loggedInUser.announcementSeen = true;
                }
            }
        } else {
            System.out.println("No new announcement!");
        }
        if(loggedInUser.newMessage.size() != 0){
            System.out.println("You have new message!");
        }
        int i = getIntegerFromUser();
        if (i == 2) {
            return new UserMessagesScreen();
        } else if (i == 0) {
            System.out.println("Logged out!");
            loggedInUser = null;
            return new StartScreen();
        } else if (i == 1) {
            return new AnnouncementsShowingScreen();
        } else if(i == 3){
         return new FriendshipRequestScreen();
        } else if(i == 4){
            System.out.println("Insert your old password!");
            String oldPassword = getStringFromUser();
            if(loggedInUser.getPassword().equals(oldPassword)){
                System.out.println("Insert new password!");
                String newPassword = getStringFromUser();
                loggedInUser.setPassword(newPassword);
                System.out.println("Your password was changed!");
            } else {
                System.out.println("Wrong password!");
            }
            return new UserHomeScreen();
        } else {
            System.out.println("Wrong input!");
            return new UserHomeScreen();
        }
    }
}
