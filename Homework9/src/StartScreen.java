public class StartScreen extends Screen {

    @Override
    public Screen process() {
        System.out.println("Login: [1]");
        System.out.println("Register: [2]");
        int i = getIntegerFromUser();
        if (i == 1) {
            return new LoginScreen();

        } else if (i == 2) {
            return new RegistrationScreen();
        } else {
            System.out.println("Wrong input!");

        }
        return new StartScreen();

    }
}
