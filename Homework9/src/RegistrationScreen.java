public class RegistrationScreen extends Screen {

    public Screen process() {
        System.out.println("Input username!");
        String username = getStringFromUser();
        boolean userExistsByUsername = userRepository.checkIfExistsByUsername(username);
        if (userExistsByUsername) {
            System.out.println("Username already exists. Try again!");
            return new RegistrationScreen();
        }
        System.out.println("Input password!");
        String password = getStringFromUser();
        User user = new User(username, password);
        userRepository.save(user);
        System.out.println("Successfully created new user with username: " + username + "!");
        return new StartScreen();

    }
}