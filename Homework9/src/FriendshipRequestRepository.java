import java.util.ArrayList;

public class FriendshipRequestRepository {
    ArrayList<FriendshipRequest> friendshipRequests;

    FriendshipRequestRepository() {
        friendshipRequests = new ArrayList<>();
    }

    public ArrayList<FriendshipRequest> getAll() {
        return friendshipRequests;
    }

    public void save(FriendshipRequest friendshipRequest) {
        friendshipRequests.add(friendshipRequest);
    }

    public ArrayList<FriendshipRequest> getFrom(RegularUser fromUser) {
        ArrayList<FriendshipRequest> result = new ArrayList<>();
        for (FriendshipRequest friendshipRequest : friendshipRequests) {
            if (friendshipRequest.getFrom().equals(fromUser)) {
                result.add(friendshipRequest);
            }
        }
        return result;
    }

    public ArrayList<FriendshipRequest> getTo(RegularUser toUser) {
        ArrayList<FriendshipRequest> result = new ArrayList<>();
        for (FriendshipRequest friendshipRequest : friendshipRequests) {
            if (friendshipRequest.getTo().equals(toUser)) {
                result.add(friendshipRequest);
            }
        }
        return result;
    }

    public ArrayList<FriendshipRequest> getOfUser(RegularUser ofUser) {
        ArrayList<FriendshipRequest> result = new ArrayList<>();
        for (FriendshipRequest friendshipRequest : friendshipRequests) {
            if (friendshipRequest.getFrom().equals(ofUser) || friendshipRequest.getTo().equals(ofUser)) {
                result.add(friendshipRequest);

            }
        }
        return result;
    }
}
