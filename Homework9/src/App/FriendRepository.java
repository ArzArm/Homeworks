package App;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FriendRepository implements Repository<Friend> {
    ArrayList<Friend> friends;

    FriendRepository() {
        friends = new ArrayList<>();
    }

    public ArrayList<Friend> getAll() {
        return friends;
    }

    public void save(Friend friend) {
        friends.add(friend);
    }

    public ArrayList<Friend> getAllFriends(RegularUser user) {
        ArrayList<Friend> result = new ArrayList<>();
        for (Friend friend : friends) {
            if (friend.getUser1().getId() == user.getId() || friend.getUser2().getId() == user.getId()) {
                result.add(friend);
            }
        }
        return result;
    }



}
