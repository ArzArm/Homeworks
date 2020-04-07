public class PersonalMessageScreen extends Screen {
    private User to;

    public PersonalMessageScreen(User to) {
        this.to = to;
    }
    @Override
    public Screen process() {
        System.out.println("Your messages from " + to.getUsername() + "!");
        for (Message message : messages) {
            if (message.getFrom().getUsername().equals(to.getUsername())) {
                System.out.println(message.getMessage());
            }
        }
        System.out.println("Write message!");
        String message = getStringFromUser();
        Message message1 = new Message(message, loggedInUser, to);
        messages.add(message1);
        to.newMessage.add(message1);
        System.out.println("Message was sent!");
        return new UserHomeScreen();
    }
}