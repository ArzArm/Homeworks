import java.util.ArrayList;

public class FriendRepository {
    ArrayList<RegularUser> friends;

    FriendRepository() {
        friends = new ArrayList<>();
    }

    public ArrayList<RegularUser> getAll() {
        return friends;
    }

    public  void  save(RegularUser friend) {
        friends.add(friend);
    }
}
