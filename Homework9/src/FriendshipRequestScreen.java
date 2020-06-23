import java.util.ArrayList;

public class FriendshipRequestScreen extends Screen {

    @Override
    public Screen process() {
        ArrayList<FriendshipRequest> allFriendshipRequests = loggedInUser.friendshipRequestRepository.getAll();
        ArrayList<RegularUser> allUsers = userRepository.getAll();
        ArrayList<RegularUser> allFriends = loggedInUser.friends.getAll();
        System.out.println("All users:");
        userRepository.printUsersExceptOne(loggedInUser);

        System.out.println("Send request: [1]");
        System.out.println("Back: [2]");
        int i = getIntegerFromUser();
        if (i == 1) {
            System.out.println("Input Username whom yuo want send");
            String to = getStringFromUser();
            RegularUser toUser = userRepository.getByUsername(to);
            for (RegularUser friend : allFriends) {
                if (toUser.equals(friend)) {
                    System.out.println(to + "is already your friend");
                }
                return new FriendshipRequestScreen();
            }

            if (toUser == null) {
                System.out.println("Wrong username!");
            } else {
                FriendshipRequest friendshipRequest = new FriendshipRequest(loggedInUser, toUser);
                toUser.friendshipRequestRepository.save(friendshipRequest);
                System.out.println("Request send!");
            }
        } else if (i == 2) {
            return new FriendshipScreen();
        } else {
            System.out.println("Wrong input");
        }
        return new FriendshipRequestScreen();
    }
}
