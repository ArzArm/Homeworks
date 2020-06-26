package App;
import java.util.ArrayList;

public class PersonalMessageScreen extends Screen {
    private RegularUser to;

    public PersonalMessageScreen(RegularUser to) {
        this.to = to;
    }
    @Override
    public Screen process() {
        System.out.println("Your messages from " + to.getUsername() + "!");
        ArrayList<Message> allReceiveMessageFrom = messageRepository.getFrom(to);

        for (Message message : allReceiveMessageFrom) {
            if (message.getTo().getId() == loggedInUser.getId())
                System.out.println(message.getMessage());
        }
        System.out.println("Write message!");
        String message = getStringFromUser();
        Message message1 = new Message(message, loggedInUser, to);
       messageRepository.save(message1);
        System.out.println("Message was sent!");
        return new UserHomeScreen();
    }
}