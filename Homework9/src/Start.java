

public class Start {

    public static void main(String[] args) {
        Screen.userRepository.save(Screen.administrator);
        Screen nextScreen = new StartScreen();
        while (true) {
            nextScreen = nextScreen.process();

        }

    }
}
