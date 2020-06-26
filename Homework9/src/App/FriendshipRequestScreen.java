package App;

import java.util.ArrayList;

public class FriendshipRequestScreen extends Screen {

    @Override
    public Screen process() {
        System.out.println("All users:");
        ArrayList<RegularUser> users = userRepository.getAll();
        for (RegularUser user : users) {
            if (!user.equals(loggedInUser)) {
                ArrayList<Friend> allFriends = friends.getAllFriends(loggedInUser);
                boolean isFriend = false;
                if (allFriends.size() == 0) {
                    System.out.println(user.getUsername());
                } else {
                    Friend friend = new Friend(loggedInUser, user);
                    for (Friend friend1 : allFriends) {
                        if (friend.equals(friend1)) {
                            isFriend = true;
                            break;

                        }
                    }
                    if (!isFriend) {
                        System.out.println(user.getUsername());
                    }
                }
            }
        }
        System.out.println("Send request: [1]");
        System.out.println("Back: [2]");
        int i = getIntegerFromUser();
        if (i == 1) {
            System.out.println("Input Username whom yuo want send");
            String to = getStringFromUser();
            RegularUser toUser = userRepository.getByUsername(to);
            ArrayList<Friend> allFriends = friends.getAllFriends(loggedInUser);
            Friend newFriend = new Friend(loggedInUser, toUser);
            for (Friend friend : allFriends) {
                if (friend.equals(newFriend)) {
                    System.out.println(to + "is already your friend");
                    return new FriendshipRequestScreen();
                }

            }

            if (toUser == null) {
                System.out.println("Wrong username!");
            } else {
                FriendshipRequest friendshipRequest = new FriendshipRequest(loggedInUser, toUser);
                friendshipRequestRepository.save(friendshipRequest);
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
