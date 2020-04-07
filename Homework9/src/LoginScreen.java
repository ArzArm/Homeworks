public class LoginScreen extends Screen {
    public Screen process() {
        System.out.println("Input username!");
        String username = getStringFromUser();
        System.out.println("Input password!");
        String password = getStringFromUser();
        User user = userRepository.getByUsernamePassword(username, password);
        if (user == null) {
            System.out.println("Wrong username password!");
            return new StartScreen();
        } else if (user == administrator) {
            System.out.println("Login successful!");
            loggedInUser = administrator;
            return new AdminHomeScreen();
        } else {
            System.out.println("Login successful!");
            loggedInUser = user;
            return new UserHomeScreen();
        }
    }

}
