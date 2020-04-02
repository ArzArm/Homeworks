public class UserMessagesScreen extends Screen {
    @Override
    public void process() {
        while (true) {

            System.out.println("Wright message: [1] ");
            System.out.println("Back:  [2]");
            System.out.println("All users");
            for (User user : userRepository.getAll()) {
                if (!loggedInUser.getUsername().equals(user.getUsername()) && !user.getUsername().equals(administrator.getUsername())) {
                    System.out.println(user.getUsername());
                }
            }
            int i = getIntegerFromUser();
            if (i == 2) {
                UserHomeScreen userHomeScreen = new UserHomeScreen();
                userHomeScreen.process();
            } else if (i == 1) {
                System.out.println("Input some user's username");
                String someUsername = getStringFromUser();
                User target = userRepository.getByUsername(someUsername);

                if (target != null && !(target.getUsername().equals(loggedInUser.getUsername())) && !(target.getUsername().equals(administrator.getUsername()))) {
                    PersonalMessageScreen personalMessageScreen = new PersonalMessageScreen(target);
                    personalMessageScreen.process();
                    break;
                } else {
                    System.out.println("No user with this username");
                }
            }
        }
    }
}