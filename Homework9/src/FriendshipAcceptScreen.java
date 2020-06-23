import java.util.ArrayList;
import java.util.Collection;

public class FriendshipAcceptScreen extends Screen {
    @Override
    public Screen process() {
        ArrayList<FriendshipRequest> allFriendshipRequests = loggedInUser.friendshipRequestRepository.getAll();
        if (allFriendshipRequests.size() != 0) {
            System.out.println("You have friendship request!");
            for (FriendshipRequest friendshipRequest : allFriendshipRequests) {
                System.out.println(friendshipRequest.getFrom().getUsername());
            }
        }
        System.out.println("Accept request: [1]");
        System.out.println("Back: [2]");
        int i = getIntegerFromUser();
        if (i == 1) {
            System.out.println("Input username whom request you want to accept!");
            String from = getStringFromUser();
            RegularUser fromUser = userRepository.getByUsername(from);
            ArrayList<FriendshipRequest> allRequestsFromUser = loggedInUser.friendshipRequestRepository.getFrom(fromUser);
            if (allRequestsFromUser.size() != 0) {
                allFriendshipRequests.removeAll(allRequestsFromUser);
                System.out.println("Request accepted");
                loggedInUser.friends.save(fromUser);
                fromUser.friends.save(loggedInUser);
            } else {
                System.out.println("Wrong input!");
            }
            return new FriendshipScreen();

        } else if (i == 2) {
            return new FriendshipScreen();
        } else {
            System.out.println("Wrong input");
        }
        return new FriendshipAcceptScreen();
    }
}
