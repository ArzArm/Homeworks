package App;

import java.util.ArrayList;

public class UserMessagesScreen extends Screen {
    @Override
    public Screen process() {
        System.out.println("Wright message: [1] ");
        System.out.println("Back:  [2]");
        System.out.println("All friends");
        ArrayList<Friend> allFriends = friends.getAllFriends(loggedInUser);
        for (Friend friend : allFriends) {
            System.out.println(friend.getFriendUsername(loggedInUser));
        }

        System.out.print("Inbox: ");
        ArrayList<Message> allReceiveMessages = messageRepository.getTo(loggedInUser);
        for (Message message : allReceiveMessages) {
            System.out.println("\n" + "From " + message.getFrom().getUsername() + " " + "[" + message.getMessage() + "]");

        }
        if (allReceiveMessages.size() == 0) {
            System.out.println("Empty!");
        }
        System.out.print("Sent: ");
        ArrayList<Message> allSentMessages = messageRepository.getFrom(loggedInUser);
        for (Message message : allSentMessages) {
            System.out.println("\n" + "To  " + message.getTo().getUsername() + " " + "[" + message.getMessage() + "]");
        }
        if (allSentMessages.size() == 0) {
            System.out.println("Empty!");
        }
        int i = getIntegerFromUser();
        if (i == 2) {
            return new UserHomeScreen();
        } else if (i == 1) {
            System.out.println("Input friend's username!");
            String someUsername = getStringFromUser();
            RegularUser target = userRepository.getByUsername(someUsername);
            if (target != null) {
                Friend friend1 = new Friend(loggedInUser, target);
                boolean isFriend = false;
                for (Friend friend2 : allFriends) {
                    if (friend2.equals(friend1)) {
                        isFriend = true;
                    }
                }
                if (isFriend) {
                    return new PersonalMessageScreen(target);
                } else {
                    System.out.println("No friend with this username!");
                    return new UserHomeScreen();
                }
            } else {
                System.out.println("Wrong input!");

            }
        }
        return new UserMessagesScreen();
    }
}
