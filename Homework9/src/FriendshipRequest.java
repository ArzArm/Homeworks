public class FriendshipRequest extends Message {

    FriendshipRequest(RegularUser from, RegularUser to) {
        super(from, to);
    }

    public String toString() {
        return getFrom().getUsername();
    }

}
