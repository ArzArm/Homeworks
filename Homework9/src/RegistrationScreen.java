public class RegistrationScreen extends Screen {

    public Screen process() {
        System.out.println("Input username!");
        String username = getStringFromUser();
        boolean userExistsByUsername = userRepository.checkIfExistsByUsername(username);
        if (username.equals(admin.getUsername() )|| userRepository.checkIfExistsByUsername(username)) {
            System.out.println("Username already exists. Try again!");
            return new RegistrationScreen();
        }
        System.out.println("Input password!");
        String password = getStringFromUser();
        RegularUser user = new RegularUser(username, password);
        userRepository.save(user);
        user.setLastReadSequentialNumber(-1);
        System.out.println("Successfully created new user with username: " + username + "!");

        return new StartScreen();

    }
}