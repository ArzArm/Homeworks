package App;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FriendshipScreen extends Screen {

    @Override
    public Screen process() {
        List<FriendshipRequest> allRequests = friendshipRequestRepository.getAllTo(loggedInUser);
        if (allRequests.size() != 0) {
            System.out.println("You have friend request");
        }
        for (FriendshipRequest friendshipRequest : allRequests) {
            System.out.println(friendshipRequest);

        }
        System.out.println("Accept friendship request: [1]");
        System.out.println("Decline friendship request: [2]");
        System.out.println("Send friendship request: [3]");
        System.out.println("Your friends: [4]");
        System.out.println("Back: [5]");

        int i = getIntegerFromUser();
        if (i == 1) {
            return new FriendshipAcceptScreen();
        } else if( i == 2) {
            return new FriendshipDeclineScreen();

        }else if (i == 3) {
            return new FriendshipRequestScreen();

        } else if (i == 4){
            return new UserFriendsScreen();



        } else if(i == 5) {
            return new UserHomeScreen();
        } else {
            System.out.println("Wrong input!");
        }
return new FriendshipScreen();
    }
}
