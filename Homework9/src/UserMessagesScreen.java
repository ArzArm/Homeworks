public class UserMessagesScreen extends Screen {
    @Override
    public Screen process() {
        System.out.println("Wright message: [1] ");
        System.out.println("Back:  [2]");
        System.out.println("All friends");
        for (User friend : loggedInUser.friends) {
            System.out.println(loggedInUser.friends.indexOf(friend) + 1 + ". " + friend.getUsername());
        }

        System.out.print("Inbox: ");
        boolean isInboxEmpty = true;
        for (Message message : messages) {
            if (message.getTo() == loggedInUser) {
                System.out.println("\n" + "From " + message.getFrom().getUsername() + " " + "[" + message.getMessage() + "]");
                isInboxEmpty = false;
                loggedInUser.newMessage.clear();

            }
        }
        if (isInboxEmpty) {
            System.out.println("Empty!");
        }
        System.out.print("Sent: ");
        boolean isSentboxEmpty = true;
        for (Message message : messages) {
            if (message.getFrom() == loggedInUser) {
                System.out.println("\n" + "To  " + message.getTo().getUsername() + " " + "[" + message.getMessage() + "]");
                isSentboxEmpty = false;
            }
        }
        if (isSentboxEmpty) {
            System.out.println("Empty!");
        }
        int i = getIntegerFromUser();
        if (i == 2) {
            return new UserHomeScreen();
        } else if (i == 1) {
            System.out.println("Input friend's username!");
            String someUsername = getStringFromUser();
            User target = userRepository.getByUsername(someUsername);
            if (target != null && loggedInUser.friends.contains(target)) {
                return new PersonalMessageScreen(target);
            } else {
                System.out.println("No friend with this username!");
                return new UserHomeScreen();
            }
        } else {
            System.out.println("Wrong input!");
            return new UserMessagesScreen();
        }

    }
}