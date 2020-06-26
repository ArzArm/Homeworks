package App;

public class Start {

    public static void main(String[] args) {

        Screen nextScreen = new StartScreen();
        while (true) {
            nextScreen = nextScreen.process();

        }

    }
}
