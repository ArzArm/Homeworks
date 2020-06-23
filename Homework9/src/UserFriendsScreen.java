import java.util.ArrayList;

public class UserFriendsScreen extends Screen {
    @Override
    public Screen process() {
        ArrayList<RegularUser> allFriends = loggedInUser.friends.getAll();
        System.out.println("Your friends!");
        for (RegularUser friend : allFriends) {
            System.out.println(friend.getUsername());
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
