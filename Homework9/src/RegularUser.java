import java.util.ArrayList;
import java.util.Objects;

public class RegularUser extends User {
    private int lastReadSequentialNumber;

    protected FriendRepository friends = new FriendRepository();
    protected FriendshipRequestRepository friendshipRequestRepository = new FriendshipRequestRepository();

    public RegularUser(String username, String password) {
        super(username, password);
        lastReadSequentialNumber = -1;

    }

    public int getLastReadSequentialNumber() {

        return lastReadSequentialNumber;
    }

    public void setLastReadSequentialNumber(int lastReadSequentialNumber) {
        this.lastReadSequentialNumber = lastReadSequentialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegularUser that = (RegularUser) o;
        return getUsername().equals(that.getUsername());
    }
}
