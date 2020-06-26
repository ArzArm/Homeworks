package App;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FriendshipRequestRepository implements Repository<FriendshipRequest> {
    List<FriendshipRequest> friendshipRequests;

    FriendshipRequestRepository() {
        this.friendshipRequests = new LinkedList<>();
    }

    public List<FriendshipRequest> getAll() {
        return friendshipRequests;
    }

    public void save(FriendshipRequest friendshipRequest) {
        for (FriendshipRequest request : friendshipRequests) {
            if (friendshipRequest.equals(request)) {
                return;
            }
        }
        friendshipRequests.add(friendshipRequest);
    }


    public void remove(FriendshipRequest friendshipRequest) {

        friendshipRequests.remove(friendshipRequest);

    }


    public List<FriendshipRequest> getAllFrom(RegularUser fromUser) {
        List<FriendshipRequest> result = new ArrayList<>();
        for (FriendshipRequest friendshipRequest : friendshipRequests) {
            if (friendshipRequest.getFrom().getId() == fromUser.getId()) {
                result.add(friendshipRequest);
            }
        }
        return result;
    }

    public List<FriendshipRequest> getAllTo(RegularUser toUser) {
        List<FriendshipRequest> result = new ArrayList<>();
        for (FriendshipRequest friendshipRequest : friendshipRequests) {
            if (friendshipRequest.getTo().getId() == toUser.getId()) {
                result.add(friendshipRequest);
            }
        }
        return result;
    }

    public List<FriendshipRequest> getOfUser(RegularUser ofUser) {
        List<FriendshipRequest> result = new ArrayList<>();
        for (FriendshipRequest friendshipRequest : friendshipRequests) {
            if (friendshipRequest.getFrom().equals(ofUser) || friendshipRequest.getTo().equals(ofUser)) {
                result.add(friendshipRequest);

            }
        }
        return result;
    }
}
