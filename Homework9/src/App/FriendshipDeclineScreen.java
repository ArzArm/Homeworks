package App;
import java.util.ArrayList;
import java.util.List;

public class FriendshipDeclineScreen extends Screen {

    @Override
    public Screen process() {
        List<FriendshipRequest> allFriendshipRequests = friendshipRequestRepository.getAllTo(loggedInUser);
        if (allFriendshipRequests.size() != 0) {
            System.out.println("You have friendship request!");
            for (FriendshipRequest friendshipRequest : allFriendshipRequests) {
                System.out.println(friendshipRequest.getFrom().getUsername());

            }
        }
        System.out.println("Decline request: [1]");
        System.out.println("Back: [2]");
        int i = getIntegerFromUser();
        if (i == 1) {
            System.out.println("Input username whom request you want to decline!");
            String from = getStringFromUser();
            RegularUser fromUser = userRepository.getByUsername(from);
            if (fromUser == null) {
                System.out.println("Wrong input!");
            } else {
                for (FriendshipRequest friendshipRequest : allFriendshipRequests) {
                    if (friendshipRequest.getFrom().equals(fromUser)) {
                        friendshipRequestRepository.remove(friendshipRequest);
                        System.out.println("Request declined");
                        return new FriendshipScreen();
                    }
                }
            }
        } else if (i == 2) {
            return new FriendshipScreen();
        } else {
            System.out.println("Wrong input");
        }
        return new FriendshipDeclineScreen();
    }
}
