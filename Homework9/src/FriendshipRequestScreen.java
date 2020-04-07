
import java.util.Collections;

public class FriendshipRequestScreen extends Screen {

    @Override
    public Screen process() {
        System.out.println("Send friendship request: [1]");
        System.out.println("Accept friendship request: [2]");
        System.out.println("Reject friendship request: [3]");
        System.out.println("Back: [4]");
        if (loggedInUser.requests.size() != 0) {
            System.out.println("You have new friendship request!");
            for (int k = 0; k < loggedInUser.requests.size(); k++) {
                System.out.println(k + 1 + ". " + loggedInUser.requests.get(k).getUsername());
            }
        } else {
            System.out.println("No any friendship request!");
        }
        int i = getIntegerFromUser();
        if (i == 1) {
            System.out.println("All users!");
            for (User user : userRepository.getAll()) {
                if (!loggedInUser.getUsername().equals(user.getUsername()) && !user.getUsername().equals(administrator.getUsername()) && !loggedInUser.friends.contains(user)) {
                    System.out.println(user.getUsername());
                }
            }
            System.out.println("Input user's name to whom you want to send friendship request!");
            String recipientUsername = getStringFromUser();
            User recipient = userRepository.getByUsername(recipientUsername);
            if (recipient != null && !loggedInUser.friends.contains(recipient)) {
                if (!recipient.getUsername().equals(loggedInUser.getUsername()) && !recipient.getUsername().equals(administrator.getUsername())) {
                    recipient.requests.add(loggedInUser);
                    System.out.println("Request sent!");
                    return new FriendshipRequestScreen();
                } else {
                    System.out.println("No user with this username!");
                }
            } else {
                System.out.println(recipient.getUsername() + " is already your friend");
            }
            return new FriendshipRequestScreen();
        } else if (i == 2) {
            System.out.println("Insert username whose request you want to accept!");
            String recipientUsername = getStringFromUser();
            User recipient = userRepository.getByUsername(recipientUsername);
            if (loggedInUser.requests.contains(recipient)) {
                loggedInUser.friends.add(recipient);
                recipient.friends.add(loggedInUser);
                loggedInUser.requests.removeAll(Collections.singleton(recipient));
                System.out.println("You have new friend: " + recipient.getUsername() + "!");
            } else {
                System.out.println("Wrong input!");
            }
            return new FriendshipRequestScreen();

        } else if (i == 3) {
            System.out.println("Insert username whose request you want to reject!");
            String recipientUsername = getStringFromUser();
            User recipient = userRepository.getByUsername(recipientUsername);
            if (loggedInUser.requests.contains(recipient)) {
                loggedInUser.requests.removeAll(Collections.singleton(recipient));
                System.out.println("Request was rejected!");
            } else {
                System.out.println("Wrong input!");
            }
            return new FriendshipRequestScreen();

        } else if (i == 4) {
            return new UserHomeScreen();
        } else {
            System.out.println("Wrong input!");
            return new FriendshipRequestScreen();
        }
    }
}
