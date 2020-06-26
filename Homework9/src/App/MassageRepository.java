package App;
import java.util.ArrayList;

public class MassageRepository implements Repository<Message>{
    private ArrayList<Message> messages;

    MassageRepository(){
        messages = new ArrayList<>();
    }
    public ArrayList<Message> getAll(){
        return messages;
    }
    public void save(Message message){
        messages.add(message);

    }
    public ArrayList<Message> getFrom(RegularUser fromUser) {
        ArrayList<Message> result = new ArrayList<>();
        for (Message message : messages) {
            if (message.getFrom().equals(fromUser)){
                result.add(message);

            }
            
        } return result;
    }
    public ArrayList<Message> getTo(RegularUser toUser) {
        ArrayList<Message> result = new ArrayList<>();
        for (Message message : messages) {
            if (message.getTo().equals(toUser)){
                result.add(message);

            }

        } return result;
    }
    public ArrayList<Message> getOfUser(RegularUser ofUser) {
        ArrayList<Message> result = new ArrayList<>();
        for (Message message : messages) {
            if (message.getFrom().equals(ofUser) || message.getTo().equals(ofUser)) {
                result.add(message);

            }

        } return result;
    }
}
