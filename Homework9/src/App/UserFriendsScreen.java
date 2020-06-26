package App;
import java.util.ArrayList;

public class UserFriendsScreen extends Screen {
    @Override
    public Screen process() {
        ArrayList<Friend> allFriends = friends.getAllFriends(loggedInUser);
        System.out.println("Your friends!");

        for (Friend friend : allFriends) {

            System.out.println(friend.getFriendUsername(loggedInUser));
        }
        System.out.println("Sand message: [1]");
        System.out.println("Back: [2]");
        int i = getIntegerFromUser();
        if (i == 1) {
            return new UserMessagesScreen();
        } else if(i == 2) {
            return  new UserHomeScreen();
        } else {
            System.out.println("Wrong input!");
        }
   return new UserHomeScreen();


    }

}
