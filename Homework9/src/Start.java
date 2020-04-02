public class Start {

    public static void main(String[] args) {
        Screen.userRepository.save(Screen.administrator);
        StartScreen startScreen = new StartScreen();
        startScreen.process();
    }
    }
