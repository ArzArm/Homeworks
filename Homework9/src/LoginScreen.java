public class LoginScreen extends Screen {
    public Screen process() {
        System.out.println("Input username!");
        String username = getStringFromUser();
        System.out.println("Input password!");
        String password = getStringFromUser();
        RegularUser user = userRepository.getByUsernamePassword(username, password);
        if (user == null && !username.equals("admin")) {
            System.out.println("Wrong username password!");
            return new StartScreen();
        } else if (username.equals( admin.getUsername()) && password.equals(admin.getPassword())) {
            System.out.println("Login successful!");
            return new AdminHomeScreen();
        } else {
            System.out.println("Login successful!");
            loggedInUser = user;
            return new UserHomeScreen();
        }
    }

}
